package org.levi.persist.hibernate.users.hobj;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * UserDaoImpl: eranda
 * Date: May 11, 2011
 * Time: 7:40:44 AM
 * To change this template use File | Settings | File Templates.
 */

@MappedSuperclass
public class HObject {
    private int _id;
    private Date _dateCreated;


    //TODO autogenerate the date
    //@Basic(optional = false)
    @Temporal(TemporalType.DATE)
    @Column(name = "created", insertable = false, updatable = false)
    public Date get_dateCreated() {
        return _dateCreated;
    }

    public void set_dateCreated(Date _dateCreated) {
        this._dateCreated = _dateCreated;
    }
}
