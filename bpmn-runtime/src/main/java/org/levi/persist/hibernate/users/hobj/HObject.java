package org.levi.persist.hibernate.users.hobj;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * UserDaoImpl: eranda
 * Date: May 11, 2011
 * Time: 7:40:44 AM
 * To change this template use File | Settings | File Templates.
 */
public class HObject {
    private Long _id;
    private Date _dataCreated;

    @Id
	@TableGenerator(name="id", table="pktble", pkColumnName="pkkey", pkColumnValue="pkval", allocationSize=1)
	@GeneratedValue(strategy= GenerationType.TABLE, generator="id")
    public Long get_id() {
        return _id;
    }

    public void set_id(Long _id) {
        this._id = _id;
    }

    public Date get_dataCreated() {
        return _dataCreated;
    }

    public void set_dataCreated(Date _dataCreated) {
        this._dataCreated = _dataCreated;
    }
}
