package pkg;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Account.class)
public abstract class Account_ {

	public static volatile SingularAttribute<Account, Integer> id;
	public static volatile SingularAttribute<Account, Date> birthday;
	public static volatile SingularAttribute<Account, String> phone;
	public static volatile SingularAttribute<Account, String> address;
	public static volatile SingularAttribute<Account, byte[]> image;
	public static volatile SingularAttribute<Account, String> userName;
	public static volatile SingularAttribute<Account, String> fullName;
	public static volatile SingularAttribute<Account, String> password;

}

