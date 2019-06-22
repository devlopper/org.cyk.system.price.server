package org.cyk.system.price.server.persistence.entities;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.cyk.system.price.server.Constant;
import org.cyk.utility.server.persistence.jpa.AbstractIdentifiedByString;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter @Accessors(chain=true) @Entity @Access(AccessType.FIELD)
@Table(name=PriceVariable.TABLE)
public class PriceVariable extends AbstractIdentifiedByString implements Serializable {
	private static final long serialVersionUID = 1L;

	@ManyToOne @JoinColumn(name = COLUMN_PRICE) @NotNull private Price price;
	
	@ManyToOne @JoinColumn(name = COLUMN_VARIABLE) @NotNull private Variable variable;
	
	@NotNull private String value;
	
	/**/
	
	public static final String FIELD_PRICE = "price";
	public static final String FIELD_VARIABLE = "variable";
	
	public static final String TABLE = Constant.TABLE_NAME_PREFIX+Price.TABLE+"_"+Variable.TABLE;
	
	public static final String COLUMN_PRICE = FIELD_PRICE;
	public static final String COLUMN_VARIABLE = FIELD_VARIABLE;

}
