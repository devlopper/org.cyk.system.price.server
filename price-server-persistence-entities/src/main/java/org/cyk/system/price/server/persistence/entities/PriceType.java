package org.cyk.system.price.server.persistence.entities;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.cyk.system.price.server.Constant;
import org.cyk.utility.server.persistence.jpa.AbstractIdentifiedByStringAndCodedAndNamed;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter @Accessors(chain=true) @Entity @Access(AccessType.FIELD)
@Table(name=PriceType.TABLE)
public class PriceType extends AbstractIdentifiedByStringAndCodedAndNamed implements Serializable {
	private static final long serialVersionUID = 1L;

	/**/
	
	@Override
	public PriceType setCode(String code) {
		return (PriceType) super.setCode(code);
	}
	
	/**/
	
	public static final String TABLE = Constant.TABLE_NAME_PREFIX+Price.TABLE+"_type";
	
	/**/

}
