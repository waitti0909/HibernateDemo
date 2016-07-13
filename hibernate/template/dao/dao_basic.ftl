${pojo.getPackageDeclaration()}
<#assign declarationName = pojo.importType(pojo.getDeclarationName())>

import com.patentdata.common.dao.GenericDAOImpl;
import com.patentdata.model.${declarationName};

/**
 * Generated ${date} by Hibernate Tools ${version}
 * object for domain model class ${declarationName}.
 * 
 * @see ${pojo.getQualifiedDeclarationName()}
 * @author Hibernate Tools
 */
public class ${declarationName}DAO extends GenericDAOImpl<${declarationName}> {
    // TODO Auto-generated function stub
}
