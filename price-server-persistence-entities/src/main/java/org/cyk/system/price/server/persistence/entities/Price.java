package org.cyk.system.price.server.persistence.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.cyk.system.price.server.Constant;
import org.cyk.utility.server.persistence.jpa.AbstractIdentifiedByStringAndCoded;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter @Accessors(chain=true) @Entity @Access(AccessType.FIELD)
@Table(name=Price.TABLE)
public class Price extends AbstractIdentifiedByStringAndCoded implements Serializable {
	private static final long serialVersionUID = 1L;

	@ManyToOne @JoinColumn(name = COLUMN_TYPE) @NotNull private PriceType type;
	@ManyToOne @JoinColumn(name = COLUMN_ARTICLE) @NotNull private Article article;
	//TODO use interval data structure
	@Column(name = COLUMN_VALUE) @NotNull private BigDecimal value;
	
	/**/
	
	@Override
	public Price setCode(String code) {
		return (Price) super.setCode(code);
	}
	
	/**/
	
	public static final String FIELD_TYPE = "type";
	public static final String FIELD_ARTICLE = "article";
	public static final String FIELD_VALUE = "value";
	
	public static final String TABLE = Constant.TABLE_NAME_PREFIX+"price";
	
	public static final String COLUMN_TYPE = FIELD_TYPE;
	public static final String COLUMN_ARTICLE = FIELD_ARTICLE;
	public static final String COLUMN_VALUE = FIELD_VALUE;
	
	/**/

}
