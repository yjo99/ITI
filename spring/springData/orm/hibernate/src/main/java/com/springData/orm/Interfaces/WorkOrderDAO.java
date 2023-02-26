package com.springData.orm.Interfaces;

import com.springData.orm.Entites.Workorder;
import java.util.*;

public interface WorkOrderDAO {

    public Workorder findByTagNo(String tagNo);

    public List<Workorder> findAllWorkorder();

    public void deletedWorkorder(Workorder w);
    public void updateWorkorder(Workorder w);
    public void addWorkorder(Workorder w);
    public Long CountWorkorderBlocked();

}
