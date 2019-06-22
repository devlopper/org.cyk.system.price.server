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
@Table(name=Article.TABLE)
public class Article extends AbstractIdentifiedByString implements Serializable {
	private static final long serialVersionUID = 1L;

	@ManyToOne @JoinColumn(name = COLUMN_TYPE) @NotNull private ArticleType type;
	
	/**/
	
	/**/
	
	public static final String FIELD_TYPE = "type";
	
	public static final String TABLE = Constant.TABLE_NAME_PREFIX+"article";
	
	public static final String COLUMN_TYPE = FIELD_TYPE;
	
	/**/

}
