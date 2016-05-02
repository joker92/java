
package it.engim.templatedb;



import it.engim.beans.Cliente;
import java.util.Iterator;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.apache.wicket.extensions.markup.html.repeater.util.SortableDataProvider;
import org.apache.wicket.model.IModel;

public class ClienteDataProvider extends SortableDataProvider<Cliente, String>
{

  @Override
  public Iterator<? extends Cliente> iterator(long first, long count)
  {
    EntityManager em = PM.getEM();
    try
    {
      Query q = em.createNamedQuery("Cliente.findAll");
      q.setFirstResult((int) first);
      q.setMaxResults((int) count);
      List<Cliente> res = q.getResultList();
      return res.iterator();
    }
    finally
    {
      em.close();
    }
  }

  @Override
  public long size()
  {
    EntityManager em = PM.getEM();
    try
    {
      CriteriaBuilder cb = em.getCriteriaBuilder();
      CriteriaQuery<Long> cq = cb.createQuery(Long.class);
      Root<Cliente> root = cq.from(Cliente.class);
      cq.select(cb.count(root));
      return em.createQuery(cq).getSingleResult();
    }
    finally
    {
      em.close();
    }
  }

  @Override
  public IModel<Cliente> model(Cliente object)
  {
    return new ClienteModel(object.getId());
  }

}
