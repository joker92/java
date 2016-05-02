
package it.engim.templatedb;




import it.engim.beans.Lapide;
import java.util.Iterator;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.apache.wicket.extensions.markup.html.repeater.util.SortableDataProvider;
import org.apache.wicket.model.IModel;

public class LapideDataProvider extends SortableDataProvider<Lapide, String>
{

  @Override
  public Iterator<? extends Lapide> iterator(long first, long count)
  {
    EntityManager em = PM.getEM();
    try
    {
      Query q = em.createNamedQuery("Lapide.findAll");
      q.setFirstResult((int) first);
      q.setMaxResults((int) count);
      List<Lapide> res = q.getResultList();
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
      Root<Lapide> root = cq.from(Lapide.class);
      cq.select(cb.count(root));
      return em.createQuery(cq).getSingleResult();
    }
    finally
    {
      em.close();
    }
  }

  @Override
  public IModel<Lapide> model(Lapide object)
  {
    return new LapideModel(object.getId());
  }

   
}
