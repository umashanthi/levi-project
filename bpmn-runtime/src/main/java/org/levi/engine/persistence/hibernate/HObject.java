package org.levi.engine.persistence.hibernate;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
public class HObject {
    private Date _dateCreated;

    @Temporal(TemporalType.DATE)
    @Column(name = "created", insertable = false, updatable = false)
    public Date get_dateCreated() {
        return _dateCreated;
    }

    public void set_dateCreated(Date _dateCreated) {
        this._dateCreated = _dateCreated;
    }
}
