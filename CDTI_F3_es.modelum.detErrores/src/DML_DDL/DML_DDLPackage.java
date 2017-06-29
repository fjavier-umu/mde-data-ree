/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package DML_DDL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see DML_DDL.DML_DDLFactory
 * @model kind="package"
 * @generated
 */
public interface DML_DDLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "DML_DDL";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://modelum.es/DML_DDL";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "DML_DDL";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DML_DDLPackage eINSTANCE = DML_DDL.impl.DML_DDLPackageImpl.init();

	/**
	 * The meta object id for the '{@link DML_DDL.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.StatementImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 0;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.DataDefinitionImpl <em>Data Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.DataDefinitionImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getDataDefinition()
	 * @generated
	 */
	int DATA_DEFINITION = 1;

	/**
	 * The number of structural features of the '<em>Data Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINITION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.DataTypeImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__TYPES = 0;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.DDLDefinitionImpl <em>DDL Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.DDLDefinitionImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getDDLDefinition()
	 * @generated
	 */
	int DDL_DEFINITION = 3;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDL_DEFINITION__STATEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDL_DEFINITION__DATA_TYPE = 1;

	/**
	 * The number of structural features of the '<em>DDL Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DDL_DEFINITION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.PkImpl <em>Pk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.PkImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getPk()
	 * @generated
	 */
	int PK = 4;

	/**
	 * The feature id for the '<em><b>Name Pk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PK__NAME_PK = 0;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PK__COLUMN_NAME = 1;

	/**
	 * The number of structural features of the '<em>Pk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PK_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.FkImpl <em>Fk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.FkImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getFk()
	 * @generated
	 */
	int FK = 5;

	/**
	 * The feature id for the '<em><b>Name Fk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FK__NAME_FK = 0;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FK__COLUMN_NAME = 1;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FK__REFERENCES = 2;

	/**
	 * The feature id for the '<em><b>Column Reference</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FK__COLUMN_REFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FK__STATUS = 4;

	/**
	 * The number of structural features of the '<em>Fk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FK_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.CkImpl <em>Ck</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.CkImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getCk()
	 * @generated
	 */
	int CK = 6;

	/**
	 * The feature id for the '<em><b>Name Ck</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CK__NAME_CK = 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CK__STATUS = 1;

	/**
	 * The feature id for the '<em><b>Values Ck</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CK__VALUES_CK = 2;

	/**
	 * The number of structural features of the '<em>Ck</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CK_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.ValuesCkImpl <em>Values Ck</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.ValuesCkImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getValuesCk()
	 * @generated
	 */
	int VALUES_CK = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_CK__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_CK__COMPARATOR = 1;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_CK__COLUMN_NAME = 2;

	/**
	 * The feature id for the '<em><b>Log Conjuntion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_CK__LOG_CONJUNTION = 3;

	/**
	 * The number of structural features of the '<em>Values Ck</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_CK_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.ColumnImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 8;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__COLUMN_NAME = 0;

	/**
	 * The feature id for the '<em><b>Comment Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__COMMENT_COLUMN = 1;

	/**
	 * The feature id for the '<em><b>Column Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__COLUMN_NULL = 2;

	/**
	 * The feature id for the '<em><b>Column Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__COLUMN_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.DatabaseImpl <em>Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.DatabaseImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getDatabase()
	 * @generated
	 */
	int DATABASE = 9;

	/**
	 * The feature id for the '<em><b>Database Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__DATABASE_NAME = DATA_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FEATURE_COUNT = DATA_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.TableImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 10;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TABLE_NAME = DATA_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comment Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COMMENT_TABLE = DATA_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COLUMNS = DATA_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Columns Pk</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COLUMNS_PK = DATA_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Columns Fk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COLUMNS_FK = DATA_DEFINITION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Checks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__CHECKS = DATA_DEFINITION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Registries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__REGISTRIES = DATA_DEFINITION_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = DATA_DEFINITION_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.RegistryImpl <em>Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.RegistryImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getRegistry()
	 * @generated
	 */
	int REGISTRY = 11;

	/**
	 * The feature id for the '<em><b>Registry Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY__REGISTRY_VALUES = 0;

	/**
	 * The number of structural features of the '<em>Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTRY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.ValueImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 12;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__COLUMN = 1;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.CommentTableImpl <em>Comment Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.CommentTableImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getCommentTable()
	 * @generated
	 */
	int COMMENT_TABLE = 13;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_TABLE__TABLE_NAME = DATA_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Table Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_TABLE__TABLE_COMMENT = DATA_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Comment Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_TABLE_FEATURE_COUNT = DATA_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.CommentColumnImpl <em>Comment Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.CommentColumnImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getCommentColumn()
	 * @generated
	 */
	int COMMENT_COLUMN = 14;

	/**
	 * The feature id for the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_COLUMN__TABLE_NAME = DATA_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Column Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_COLUMN__COLUMN_NAME = DATA_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Column Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_COLUMN__COLUMN_COMMENT = DATA_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Comment Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_COLUMN_FEATURE_COUNT = DATA_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.TypeImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.ExactoImpl <em>Exacto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.ExactoImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getExacto()
	 * @generated
	 */
	int EXACTO = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXACTO__NAME = TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Exacto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXACTO_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.IntegerImpl <em>Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.IntegerImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER__NAME = EXACTO__NAME;

	/**
	 * The number of structural features of the '<em>Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FEATURE_COUNT = EXACTO_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.SmallIntegerImpl <em>Small Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.SmallIntegerImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getSmallInteger()
	 * @generated
	 */
	int SMALL_INTEGER = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_INTEGER__NAME = EXACTO__NAME;

	/**
	 * The number of structural features of the '<em>Small Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_INTEGER_FEATURE_COUNT = EXACTO_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.IntImpl <em>Int</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.IntImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getInt()
	 * @generated
	 */
	int INT = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT__NAME = EXACTO__NAME;

	/**
	 * The number of structural features of the '<em>Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_FEATURE_COUNT = EXACTO_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.SmallIntImpl <em>Small Int</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.SmallIntImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getSmallInt()
	 * @generated
	 */
	int SMALL_INT = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_INT__NAME = EXACTO__NAME;

	/**
	 * The number of structural features of the '<em>Small Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_INT_FEATURE_COUNT = EXACTO_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.NumberImpl <em>Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.NumberImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getNumber()
	 * @generated
	 */
	int NUMBER = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__NAME = EXACTO__NAME;

	/**
	 * The number of structural features of the '<em>Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FEATURE_COUNT = EXACTO_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.NumericImpl <em>Numeric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.NumericImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getNumeric()
	 * @generated
	 */
	int NUMERIC = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC__NAME = EXACTO__NAME;

	/**
	 * The number of structural features of the '<em>Numeric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_FEATURE_COUNT = EXACTO_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.DecimalImpl <em>Decimal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.DecimalImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getDecimal()
	 * @generated
	 */
	int DECIMAL = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL__NAME = EXACTO__NAME;

	/**
	 * The number of structural features of the '<em>Decimal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_FEATURE_COUNT = EXACTO_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.AproximadoImpl <em>Aproximado</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.AproximadoImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getAproximado()
	 * @generated
	 */
	int APROXIMADO = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APROXIMADO__NAME = TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Aproximado</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APROXIMADO_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.RealImpl <em>Real</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.RealImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getReal()
	 * @generated
	 */
	int REAL = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL__NAME = APROXIMADO__NAME;

	/**
	 * The number of structural features of the '<em>Real</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_FEATURE_COUNT = APROXIMADO_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.DoublePrecisionImpl <em>Double Precision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.DoublePrecisionImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getDoublePrecision()
	 * @generated
	 */
	int DOUBLE_PRECISION = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_PRECISION__NAME = APROXIMADO__NAME;

	/**
	 * The number of structural features of the '<em>Double Precision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_PRECISION_FEATURE_COUNT = APROXIMADO_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.FloatImpl <em>Float</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.FloatImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getFloat()
	 * @generated
	 */
	int FLOAT = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT__NAME = APROXIMADO__NAME;

	/**
	 * The number of structural features of the '<em>Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_FEATURE_COUNT = APROXIMADO_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.LongImpl <em>Long</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.LongImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getLong()
	 * @generated
	 */
	int LONG = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG__NAME = APROXIMADO__NAME;

	/**
	 * The number of structural features of the '<em>Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_FEATURE_COUNT = APROXIMADO_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.LongRawImpl <em>Long Raw</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.LongRawImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getLongRaw()
	 * @generated
	 */
	int LONG_RAW = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_RAW__NAME = APROXIMADO__NAME;

	/**
	 * The number of structural features of the '<em>Long Raw</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_RAW_FEATURE_COUNT = APROXIMADO_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.CharactersImpl <em>Characters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.CharactersImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getCharacters()
	 * @generated
	 */
	int CHARACTERS = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERS__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>N</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERS__N = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Characters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERS_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.CharacterImpl <em>Character</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.CharacterImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getCharacter()
	 * @generated
	 */
	int CHARACTER = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER__NAME = CHARACTERS__NAME;

	/**
	 * The feature id for the '<em><b>N</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER__N = CHARACTERS__N;

	/**
	 * The number of structural features of the '<em>Character</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_FEATURE_COUNT = CHARACTERS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.CharacterVaryingImpl <em>Character Varying</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.CharacterVaryingImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getCharacterVarying()
	 * @generated
	 */
	int CHARACTER_VARYING = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_VARYING__NAME = CHARACTERS__NAME;

	/**
	 * The feature id for the '<em><b>N</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_VARYING__N = CHARACTERS__N;

	/**
	 * The number of structural features of the '<em>Character Varying</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_VARYING_FEATURE_COUNT = CHARACTERS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.CharImpl <em>Char</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.CharImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getChar()
	 * @generated
	 */
	int CHAR = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR__NAME = CHARACTERS__NAME;

	/**
	 * The feature id for the '<em><b>N</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR__N = CHARACTERS__N;

	/**
	 * The number of structural features of the '<em>Char</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_FEATURE_COUNT = CHARACTERS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.VarCharImpl <em>Var Char</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.VarCharImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getVarChar()
	 * @generated
	 */
	int VAR_CHAR = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_CHAR__NAME = CHARACTERS__NAME;

	/**
	 * The feature id for the '<em><b>N</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_CHAR__N = CHARACTERS__N;

	/**
	 * The number of structural features of the '<em>Var Char</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_CHAR_FEATURE_COUNT = CHARACTERS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.VarChar2Impl <em>Var Char2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.VarChar2Impl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getVarChar2()
	 * @generated
	 */
	int VAR_CHAR2 = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_CHAR2__NAME = CHARACTERS__NAME;

	/**
	 * The feature id for the '<em><b>N</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_CHAR2__N = CHARACTERS__N;

	/**
	 * The number of structural features of the '<em>Var Char2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_CHAR2_FEATURE_COUNT = CHARACTERS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.NVarChar2Impl <em>NVar Char2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.NVarChar2Impl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getNVarChar2()
	 * @generated
	 */
	int NVAR_CHAR2 = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NVAR_CHAR2__NAME = CHARACTERS__NAME;

	/**
	 * The feature id for the '<em><b>N</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NVAR_CHAR2__N = CHARACTERS__N;

	/**
	 * The number of structural features of the '<em>NVar Char2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NVAR_CHAR2_FEATURE_COUNT = CHARACTERS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.NCharImpl <em>NChar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.NCharImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getNChar()
	 * @generated
	 */
	int NCHAR = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NCHAR__NAME = CHARACTERS__NAME;

	/**
	 * The feature id for the '<em><b>N</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NCHAR__N = CHARACTERS__N;

	/**
	 * The number of structural features of the '<em>NChar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NCHAR_FEATURE_COUNT = CHARACTERS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.CharVaryingImpl <em>Char Varying</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.CharVaryingImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getCharVarying()
	 * @generated
	 */
	int CHAR_VARYING = 38;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_VARYING__NAME = CHARACTERS__NAME;

	/**
	 * The feature id for the '<em><b>N</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_VARYING__N = CHARACTERS__N;

	/**
	 * The number of structural features of the '<em>Char Varying</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_VARYING_FEATURE_COUNT = CHARACTERS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.NationalCharImpl <em>National Char</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.NationalCharImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getNationalChar()
	 * @generated
	 */
	int NATIONAL_CHAR = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIONAL_CHAR__NAME = CHARACTERS__NAME;

	/**
	 * The feature id for the '<em><b>N</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIONAL_CHAR__N = CHARACTERS__N;

	/**
	 * The number of structural features of the '<em>National Char</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIONAL_CHAR_FEATURE_COUNT = CHARACTERS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.NationalCharVaryingImpl <em>National Char Varying</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.NationalCharVaryingImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getNationalCharVarying()
	 * @generated
	 */
	int NATIONAL_CHAR_VARYING = 40;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIONAL_CHAR_VARYING__NAME = CHARACTERS__NAME;

	/**
	 * The feature id for the '<em><b>N</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIONAL_CHAR_VARYING__N = CHARACTERS__N;

	/**
	 * The number of structural features of the '<em>National Char Varying</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIONAL_CHAR_VARYING_FEATURE_COUNT = CHARACTERS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.NationalCharacterImpl <em>National Character</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.NationalCharacterImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getNationalCharacter()
	 * @generated
	 */
	int NATIONAL_CHARACTER = 41;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIONAL_CHARACTER__NAME = CHARACTERS__NAME;

	/**
	 * The feature id for the '<em><b>N</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIONAL_CHARACTER__N = CHARACTERS__N;

	/**
	 * The number of structural features of the '<em>National Character</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIONAL_CHARACTER_FEATURE_COUNT = CHARACTERS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.NationalCharacterVaryingImpl <em>National Character Varying</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.NationalCharacterVaryingImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getNationalCharacterVarying()
	 * @generated
	 */
	int NATIONAL_CHARACTER_VARYING = 42;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIONAL_CHARACTER_VARYING__NAME = CHARACTERS__NAME;

	/**
	 * The feature id for the '<em><b>N</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIONAL_CHARACTER_VARYING__N = CHARACTERS__N;

	/**
	 * The number of structural features of the '<em>National Character Varying</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIONAL_CHARACTER_VARYING_FEATURE_COUNT = CHARACTERS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.NCharVaryingImpl <em>NChar Varying</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.NCharVaryingImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getNCharVarying()
	 * @generated
	 */
	int NCHAR_VARYING = 43;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NCHAR_VARYING__NAME = CHARACTERS__NAME;

	/**
	 * The feature id for the '<em><b>N</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NCHAR_VARYING__N = CHARACTERS__N;

	/**
	 * The number of structural features of the '<em>NChar Varying</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NCHAR_VARYING_FEATURE_COUNT = CHARACTERS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.ClobImpl <em>Clob</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.ClobImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getClob()
	 * @generated
	 */
	int CLOB = 44;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOB__NAME = CHARACTERS__NAME;

	/**
	 * The feature id for the '<em><b>N</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOB__N = CHARACTERS__N;

	/**
	 * The number of structural features of the '<em>Clob</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOB_FEATURE_COUNT = CHARACTERS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.NClobImpl <em>NClob</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.NClobImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getNClob()
	 * @generated
	 */
	int NCLOB = 45;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NCLOB__NAME = CHARACTERS__NAME;

	/**
	 * The feature id for the '<em><b>N</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NCLOB__N = CHARACTERS__N;

	/**
	 * The number of structural features of the '<em>NClob</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NCLOB_FEATURE_COUNT = CHARACTERS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.BitsImpl <em>Bits</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.BitsImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getBits()
	 * @generated
	 */
	int BITS = 46;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITS__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>N</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITS__N = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bits</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITS_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.BitImpl <em>Bit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.BitImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getBit()
	 * @generated
	 */
	int BIT = 47;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT__NAME = BITS__NAME;

	/**
	 * The feature id for the '<em><b>N</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT__N = BITS__N;

	/**
	 * The number of structural features of the '<em>Bit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FEATURE_COUNT = BITS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.BitVaryingImpl <em>Bit Varying</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.BitVaryingImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getBitVarying()
	 * @generated
	 */
	int BIT_VARYING = 48;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_VARYING__NAME = BIT__NAME;

	/**
	 * The feature id for the '<em><b>N</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_VARYING__N = BIT__N;

	/**
	 * The number of structural features of the '<em>Bit Varying</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_VARYING_FEATURE_COUNT = BIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.TimesImpl <em>Times</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.TimesImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getTimes()
	 * @generated
	 */
	int TIMES = 49;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMES__NAME = TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Times</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMES_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.DateImpl <em>Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.DateImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 50;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__NAME = TIMES__NAME;

	/**
	 * The number of structural features of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FEATURE_COUNT = TIMES_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.TimeImpl <em>Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.TimeImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getTime()
	 * @generated
	 */
	int TIME = 51;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__NAME = TIMES__NAME;

	/**
	 * The number of structural features of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FEATURE_COUNT = TIMES_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.TimestampImpl <em>Timestamp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.TimestampImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getTimestamp()
	 * @generated
	 */
	int TIMESTAMP = 52;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP__NAME = TIMES__NAME;

	/**
	 * The number of structural features of the '<em>Timestamp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_FEATURE_COUNT = TIMES_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.IntervalsImpl <em>Intervals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.IntervalsImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getIntervals()
	 * @generated
	 */
	int INTERVALS = 53;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVALS__NAME = TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Intervals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVALS_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.YearMonthImpl <em>Year Month</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.YearMonthImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getYearMonth()
	 * @generated
	 */
	int YEAR_MONTH = 54;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_MONTH__NAME = INTERVALS__NAME;

	/**
	 * The number of structural features of the '<em>Year Month</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_MONTH_FEATURE_COUNT = INTERVALS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.DayTimeImpl <em>Day Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.DayTimeImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getDayTime()
	 * @generated
	 */
	int DAY_TIME = 55;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_TIME__NAME = INTERVALS__NAME;

	/**
	 * The number of structural features of the '<em>Day Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_TIME_FEATURE_COUNT = INTERVALS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.BinariesImpl <em>Binaries</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.BinariesImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getBinaries()
	 * @generated
	 */
	int BINARIES = 56;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARIES__NAME = TYPE__NAME;

	/**
	 * The number of structural features of the '<em>Binaries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARIES_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.BinaryDoubleImpl <em>Binary Double</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.BinaryDoubleImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getBinaryDouble()
	 * @generated
	 */
	int BINARY_DOUBLE = 57;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DOUBLE__NAME = BINARIES__NAME;

	/**
	 * The number of structural features of the '<em>Binary Double</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DOUBLE_FEATURE_COUNT = BINARIES_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.BinaryFloatImpl <em>Binary Float</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.BinaryFloatImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getBinaryFloat()
	 * @generated
	 */
	int BINARY_FLOAT = 58;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FLOAT__NAME = BINARIES__NAME;

	/**
	 * The number of structural features of the '<em>Binary Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FLOAT_FEATURE_COUNT = BINARIES_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.BFileImpl <em>BFile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.BFileImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getBFile()
	 * @generated
	 */
	int BFILE = 59;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFILE__NAME = BINARIES__NAME;

	/**
	 * The number of structural features of the '<em>BFile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BFILE_FEATURE_COUNT = BINARIES_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link DML_DDL.impl.BlobImpl <em>Blob</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DML_DDL.impl.BlobImpl
	 * @see DML_DDL.impl.DML_DDLPackageImpl#getBlob()
	 * @generated
	 */
	int BLOB = 60;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB__NAME = BINARIES__NAME;

	/**
	 * The number of structural features of the '<em>Blob</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_FEATURE_COUNT = BINARIES_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link DML_DDL.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see DML_DDL.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link DML_DDL.DataDefinition <em>Data Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Definition</em>'.
	 * @see DML_DDL.DataDefinition
	 * @generated
	 */
	EClass getDataDefinition();

	/**
	 * Returns the meta object for class '{@link DML_DDL.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see DML_DDL.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for the containment reference list '{@link DML_DDL.DataType#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see DML_DDL.DataType#getTypes()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_Types();

	/**
	 * Returns the meta object for class '{@link DML_DDL.DDLDefinition <em>DDL Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DDL Definition</em>'.
	 * @see DML_DDL.DDLDefinition
	 * @generated
	 */
	EClass getDDLDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link DML_DDL.DDLDefinition#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see DML_DDL.DDLDefinition#getStatements()
	 * @see #getDDLDefinition()
	 * @generated
	 */
	EReference getDDLDefinition_Statements();

	/**
	 * Returns the meta object for the containment reference '{@link DML_DDL.DDLDefinition#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Type</em>'.
	 * @see DML_DDL.DDLDefinition#getDataType()
	 * @see #getDDLDefinition()
	 * @generated
	 */
	EReference getDDLDefinition_DataType();

	/**
	 * Returns the meta object for class '{@link DML_DDL.Pk <em>Pk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pk</em>'.
	 * @see DML_DDL.Pk
	 * @generated
	 */
	EClass getPk();

	/**
	 * Returns the meta object for the attribute '{@link DML_DDL.Pk#getNamePk <em>Name Pk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Pk</em>'.
	 * @see DML_DDL.Pk#getNamePk()
	 * @see #getPk()
	 * @generated
	 */
	EAttribute getPk_NamePk();

	/**
	 * Returns the meta object for the attribute list '{@link DML_DDL.Pk#getColumnName <em>Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Column Name</em>'.
	 * @see DML_DDL.Pk#getColumnName()
	 * @see #getPk()
	 * @generated
	 */
	EAttribute getPk_ColumnName();

	/**
	 * Returns the meta object for class '{@link DML_DDL.Fk <em>Fk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fk</em>'.
	 * @see DML_DDL.Fk
	 * @generated
	 */
	EClass getFk();

	/**
	 * Returns the meta object for the attribute '{@link DML_DDL.Fk#getNameFk <em>Name Fk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Fk</em>'.
	 * @see DML_DDL.Fk#getNameFk()
	 * @see #getFk()
	 * @generated
	 */
	EAttribute getFk_NameFk();

	/**
	 * Returns the meta object for the attribute list '{@link DML_DDL.Fk#getColumnName <em>Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Column Name</em>'.
	 * @see DML_DDL.Fk#getColumnName()
	 * @see #getFk()
	 * @generated
	 */
	EAttribute getFk_ColumnName();

	/**
	 * Returns the meta object for the reference '{@link DML_DDL.Fk#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>References</em>'.
	 * @see DML_DDL.Fk#getReferences()
	 * @see #getFk()
	 * @generated
	 */
	EReference getFk_References();

	/**
	 * Returns the meta object for the attribute list '{@link DML_DDL.Fk#getColumnReference <em>Column Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Column Reference</em>'.
	 * @see DML_DDL.Fk#getColumnReference()
	 * @see #getFk()
	 * @generated
	 */
	EAttribute getFk_ColumnReference();

	/**
	 * Returns the meta object for the attribute '{@link DML_DDL.Fk#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see DML_DDL.Fk#getStatus()
	 * @see #getFk()
	 * @generated
	 */
	EAttribute getFk_Status();

	/**
	 * Returns the meta object for class '{@link DML_DDL.Ck <em>Ck</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ck</em>'.
	 * @see DML_DDL.Ck
	 * @generated
	 */
	EClass getCk();

	/**
	 * Returns the meta object for the attribute '{@link DML_DDL.Ck#getNameCk <em>Name Ck</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Ck</em>'.
	 * @see DML_DDL.Ck#getNameCk()
	 * @see #getCk()
	 * @generated
	 */
	EAttribute getCk_NameCk();

	/**
	 * Returns the meta object for the attribute '{@link DML_DDL.Ck#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see DML_DDL.Ck#getStatus()
	 * @see #getCk()
	 * @generated
	 */
	EAttribute getCk_Status();

	/**
	 * Returns the meta object for the containment reference list '{@link DML_DDL.Ck#getValuesCk <em>Values Ck</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values Ck</em>'.
	 * @see DML_DDL.Ck#getValuesCk()
	 * @see #getCk()
	 * @generated
	 */
	EReference getCk_ValuesCk();

	/**
	 * Returns the meta object for class '{@link DML_DDL.ValuesCk <em>Values Ck</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Values Ck</em>'.
	 * @see DML_DDL.ValuesCk
	 * @generated
	 */
	EClass getValuesCk();

	/**
	 * Returns the meta object for the attribute list '{@link DML_DDL.ValuesCk#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see DML_DDL.ValuesCk#getValue()
	 * @see #getValuesCk()
	 * @generated
	 */
	EAttribute getValuesCk_Value();

	/**
	 * Returns the meta object for the attribute '{@link DML_DDL.ValuesCk#getComparator <em>Comparator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparator</em>'.
	 * @see DML_DDL.ValuesCk#getComparator()
	 * @see #getValuesCk()
	 * @generated
	 */
	EAttribute getValuesCk_Comparator();

	/**
	 * Returns the meta object for the attribute '{@link DML_DDL.ValuesCk#getColumnName <em>Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Name</em>'.
	 * @see DML_DDL.ValuesCk#getColumnName()
	 * @see #getValuesCk()
	 * @generated
	 */
	EAttribute getValuesCk_ColumnName();

	/**
	 * Returns the meta object for the attribute '{@link DML_DDL.ValuesCk#getLogConjuntion <em>Log Conjuntion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log Conjuntion</em>'.
	 * @see DML_DDL.ValuesCk#getLogConjuntion()
	 * @see #getValuesCk()
	 * @generated
	 */
	EAttribute getValuesCk_LogConjuntion();

	/**
	 * Returns the meta object for class '{@link DML_DDL.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see DML_DDL.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the attribute '{@link DML_DDL.Column#getColumnName <em>Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Name</em>'.
	 * @see DML_DDL.Column#getColumnName()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_ColumnName();

	/**
	 * Returns the meta object for the attribute '{@link DML_DDL.Column#getCommentColumn <em>Comment Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment Column</em>'.
	 * @see DML_DDL.Column#getCommentColumn()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_CommentColumn();

	/**
	 * Returns the meta object for the attribute '{@link DML_DDL.Column#isColumnNull <em>Column Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Null</em>'.
	 * @see DML_DDL.Column#isColumnNull()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_ColumnNull();

	/**
	 * Returns the meta object for the reference '{@link DML_DDL.Column#getColumnType <em>Column Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Column Type</em>'.
	 * @see DML_DDL.Column#getColumnType()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_ColumnType();

	/**
	 * Returns the meta object for class '{@link DML_DDL.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database</em>'.
	 * @see DML_DDL.Database
	 * @generated
	 */
	EClass getDatabase();

	/**
	 * Returns the meta object for the attribute '{@link DML_DDL.Database#getDatabaseName <em>Database Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database Name</em>'.
	 * @see DML_DDL.Database#getDatabaseName()
	 * @see #getDatabase()
	 * @generated
	 */
	EAttribute getDatabase_DatabaseName();

	/**
	 * Returns the meta object for class '{@link DML_DDL.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see DML_DDL.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the attribute '{@link DML_DDL.Table#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see DML_DDL.Table#getTableName()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_TableName();

	/**
	 * Returns the meta object for the attribute '{@link DML_DDL.Table#getCommentTable <em>Comment Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment Table</em>'.
	 * @see DML_DDL.Table#getCommentTable()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_CommentTable();

	/**
	 * Returns the meta object for the containment reference list '{@link DML_DDL.Table#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see DML_DDL.Table#getColumns()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Columns();

	/**
	 * Returns the meta object for the containment reference '{@link DML_DDL.Table#getColumnsPk <em>Columns Pk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Columns Pk</em>'.
	 * @see DML_DDL.Table#getColumnsPk()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_ColumnsPk();

	/**
	 * Returns the meta object for the containment reference list '{@link DML_DDL.Table#getColumnsFk <em>Columns Fk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns Fk</em>'.
	 * @see DML_DDL.Table#getColumnsFk()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_ColumnsFk();

	/**
	 * Returns the meta object for the containment reference list '{@link DML_DDL.Table#getChecks <em>Checks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Checks</em>'.
	 * @see DML_DDL.Table#getChecks()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Checks();

	/**
	 * Returns the meta object for the containment reference list '{@link DML_DDL.Table#getRegistries <em>Registries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Registries</em>'.
	 * @see DML_DDL.Table#getRegistries()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Registries();

	/**
	 * Returns the meta object for class '{@link DML_DDL.Registry <em>Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registry</em>'.
	 * @see DML_DDL.Registry
	 * @generated
	 */
	EClass getRegistry();

	/**
	 * Returns the meta object for the containment reference list '{@link DML_DDL.Registry#getRegistryValues <em>Registry Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Registry Values</em>'.
	 * @see DML_DDL.Registry#getRegistryValues()
	 * @see #getRegistry()
	 * @generated
	 */
	EReference getRegistry_RegistryValues();

	/**
	 * Returns the meta object for class '{@link DML_DDL.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see DML_DDL.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for the attribute '{@link DML_DDL.Value#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see DML_DDL.Value#getValue()
	 * @see #getValue()
	 * @generated
	 */
	EAttribute getValue_Value();

	/**
	 * Returns the meta object for the reference '{@link DML_DDL.Value#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Column</em>'.
	 * @see DML_DDL.Value#getColumn()
	 * @see #getValue()
	 * @generated
	 */
	EReference getValue_Column();

	/**
	 * Returns the meta object for class '{@link DML_DDL.CommentTable <em>Comment Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment Table</em>'.
	 * @see DML_DDL.CommentTable
	 * @generated
	 */
	EClass getCommentTable();

	/**
	 * Returns the meta object for the attribute '{@link DML_DDL.CommentTable#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see DML_DDL.CommentTable#getTableName()
	 * @see #getCommentTable()
	 * @generated
	 */
	EAttribute getCommentTable_TableName();

	/**
	 * Returns the meta object for the attribute '{@link DML_DDL.CommentTable#getTableComment <em>Table Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Comment</em>'.
	 * @see DML_DDL.CommentTable#getTableComment()
	 * @see #getCommentTable()
	 * @generated
	 */
	EAttribute getCommentTable_TableComment();

	/**
	 * Returns the meta object for class '{@link DML_DDL.CommentColumn <em>Comment Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment Column</em>'.
	 * @see DML_DDL.CommentColumn
	 * @generated
	 */
	EClass getCommentColumn();

	/**
	 * Returns the meta object for the attribute '{@link DML_DDL.CommentColumn#getTableName <em>Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Name</em>'.
	 * @see DML_DDL.CommentColumn#getTableName()
	 * @see #getCommentColumn()
	 * @generated
	 */
	EAttribute getCommentColumn_TableName();

	/**
	 * Returns the meta object for the attribute '{@link DML_DDL.CommentColumn#getColumnName <em>Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Name</em>'.
	 * @see DML_DDL.CommentColumn#getColumnName()
	 * @see #getCommentColumn()
	 * @generated
	 */
	EAttribute getCommentColumn_ColumnName();

	/**
	 * Returns the meta object for the attribute '{@link DML_DDL.CommentColumn#getColumnComment <em>Column Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Comment</em>'.
	 * @see DML_DDL.CommentColumn#getColumnComment()
	 * @see #getCommentColumn()
	 * @generated
	 */
	EAttribute getCommentColumn_ColumnComment();

	/**
	 * Returns the meta object for class '{@link DML_DDL.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see DML_DDL.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the attribute '{@link DML_DDL.Type#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see DML_DDL.Type#getName()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Name();

	/**
	 * Returns the meta object for class '{@link DML_DDL.Exacto <em>Exacto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exacto</em>'.
	 * @see DML_DDL.Exacto
	 * @generated
	 */
	EClass getExacto();

	/**
	 * Returns the meta object for class '{@link DML_DDL.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer</em>'.
	 * @see DML_DDL.Integer
	 * @generated
	 */
	EClass getInteger();

	/**
	 * Returns the meta object for class '{@link DML_DDL.SmallInteger <em>Small Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Small Integer</em>'.
	 * @see DML_DDL.SmallInteger
	 * @generated
	 */
	EClass getSmallInteger();

	/**
	 * Returns the meta object for class '{@link DML_DDL.Int <em>Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int</em>'.
	 * @see DML_DDL.Int
	 * @generated
	 */
	EClass getInt();

	/**
	 * Returns the meta object for class '{@link DML_DDL.SmallInt <em>Small Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Small Int</em>'.
	 * @see DML_DDL.SmallInt
	 * @generated
	 */
	EClass getSmallInt();

	/**
	 * Returns the meta object for class '{@link DML_DDL.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number</em>'.
	 * @see DML_DDL.Number
	 * @generated
	 */
	EClass getNumber();

	/**
	 * Returns the meta object for class '{@link DML_DDL.Numeric <em>Numeric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric</em>'.
	 * @see DML_DDL.Numeric
	 * @generated
	 */
	EClass getNumeric();

	/**
	 * Returns the meta object for class '{@link DML_DDL.Decimal <em>Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decimal</em>'.
	 * @see DML_DDL.Decimal
	 * @generated
	 */
	EClass getDecimal();

	/**
	 * Returns the meta object for class '{@link DML_DDL.Aproximado <em>Aproximado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aproximado</em>'.
	 * @see DML_DDL.Aproximado
	 * @generated
	 */
	EClass getAproximado();

	/**
	 * Returns the meta object for class '{@link DML_DDL.Real <em>Real</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real</em>'.
	 * @see DML_DDL.Real
	 * @generated
	 */
	EClass getReal();

	/**
	 * Returns the meta object for class '{@link DML_DDL.DoublePrecision <em>Double Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Precision</em>'.
	 * @see DML_DDL.DoublePrecision
	 * @generated
	 */
	EClass getDoublePrecision();

	/**
	 * Returns the meta object for class '{@link DML_DDL.Float <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float</em>'.
	 * @see DML_DDL.Float
	 * @generated
	 */
	EClass getFloat();

	/**
	 * Returns the meta object for class '{@link DML_DDL.Long <em>Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Long</em>'.
	 * @see DML_DDL.Long
	 * @generated
	 */
	EClass getLong();

	/**
	 * Returns the meta object for class '{@link DML_DDL.LongRaw <em>Long Raw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Long Raw</em>'.
	 * @see DML_DDL.LongRaw
	 * @generated
	 */
	EClass getLongRaw();

	/**
	 * Returns the meta object for class '{@link DML_DDL.Characters <em>Characters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Characters</em>'.
	 * @see DML_DDL.Characters
	 * @generated
	 */
	EClass getCharacters();

	/**
	 * Returns the meta object for the attribute '{@link DML_DDL.Characters#getN <em>N</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>N</em>'.
	 * @see DML_DDL.Characters#getN()
	 * @see #getCharacters()
	 * @generated
	 */
	EAttribute getCharacters_N();

	/**
	 * Returns the meta object for class '{@link DML_DDL.Character <em>Character</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Character</em>'.
	 * @see DML_DDL.Character
	 * @generated
	 */
	EClass getCharacter();

	/**
	 * Returns the meta object for class '{@link DML_DDL.CharacterVarying <em>Character Varying</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Character Varying</em>'.
	 * @see DML_DDL.CharacterVarying
	 * @generated
	 */
	EClass getCharacterVarying();

	/**
	 * Returns the meta object for class '{@link DML_DDL.Char <em>Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Char</em>'.
	 * @see DML_DDL.Char
	 * @generated
	 */
	EClass getChar();

	/**
	 * Returns the meta object for class '{@link DML_DDL.VarChar <em>Var Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Char</em>'.
	 * @see DML_DDL.VarChar
	 * @generated
	 */
	EClass getVarChar();

	/**
	 * Returns the meta object for class '{@link DML_DDL.VarChar2 <em>Var Char2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Char2</em>'.
	 * @see DML_DDL.VarChar2
	 * @generated
	 */
	EClass getVarChar2();

	/**
	 * Returns the meta object for class '{@link DML_DDL.NVarChar2 <em>NVar Char2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NVar Char2</em>'.
	 * @see DML_DDL.NVarChar2
	 * @generated
	 */
	EClass getNVarChar2();

	/**
	 * Returns the meta object for class '{@link DML_DDL.NChar <em>NChar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NChar</em>'.
	 * @see DML_DDL.NChar
	 * @generated
	 */
	EClass getNChar();

	/**
	 * Returns the meta object for class '{@link DML_DDL.CharVarying <em>Char Varying</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Char Varying</em>'.
	 * @see DML_DDL.CharVarying
	 * @generated
	 */
	EClass getCharVarying();

	/**
	 * Returns the meta object for class '{@link DML_DDL.NationalChar <em>National Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>National Char</em>'.
	 * @see DML_DDL.NationalChar
	 * @generated
	 */
	EClass getNationalChar();

	/**
	 * Returns the meta object for class '{@link DML_DDL.NationalCharVarying <em>National Char Varying</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>National Char Varying</em>'.
	 * @see DML_DDL.NationalCharVarying
	 * @generated
	 */
	EClass getNationalCharVarying();

	/**
	 * Returns the meta object for class '{@link DML_DDL.NationalCharacter <em>National Character</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>National Character</em>'.
	 * @see DML_DDL.NationalCharacter
	 * @generated
	 */
	EClass getNationalCharacter();

	/**
	 * Returns the meta object for class '{@link DML_DDL.NationalCharacterVarying <em>National Character Varying</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>National Character Varying</em>'.
	 * @see DML_DDL.NationalCharacterVarying
	 * @generated
	 */
	EClass getNationalCharacterVarying();

	/**
	 * Returns the meta object for class '{@link DML_DDL.NCharVarying <em>NChar Varying</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NChar Varying</em>'.
	 * @see DML_DDL.NCharVarying
	 * @generated
	 */
	EClass getNCharVarying();

	/**
	 * Returns the meta object for class '{@link DML_DDL.Clob <em>Clob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clob</em>'.
	 * @see DML_DDL.Clob
	 * @generated
	 */
	EClass getClob();

	/**
	 * Returns the meta object for class '{@link DML_DDL.NClob <em>NClob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NClob</em>'.
	 * @see DML_DDL.NClob
	 * @generated
	 */
	EClass getNClob();

	/**
	 * Returns the meta object for class '{@link DML_DDL.Bits <em>Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bits</em>'.
	 * @see DML_DDL.Bits
	 * @generated
	 */
	EClass getBits();

	/**
	 * Returns the meta object for the attribute '{@link DML_DDL.Bits#getN <em>N</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>N</em>'.
	 * @see DML_DDL.Bits#getN()
	 * @see #getBits()
	 * @generated
	 */
	EAttribute getBits_N();

	/**
	 * Returns the meta object for class '{@link DML_DDL.Bit <em>Bit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bit</em>'.
	 * @see DML_DDL.Bit
	 * @generated
	 */
	EClass getBit();

	/**
	 * Returns the meta object for class '{@link DML_DDL.BitVarying <em>Bit Varying</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bit Varying</em>'.
	 * @see DML_DDL.BitVarying
	 * @generated
	 */
	EClass getBitVarying();

	/**
	 * Returns the meta object for class '{@link DML_DDL.Times <em>Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Times</em>'.
	 * @see DML_DDL.Times
	 * @generated
	 */
	EClass getTimes();

	/**
	 * Returns the meta object for class '{@link DML_DDL.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date</em>'.
	 * @see DML_DDL.Date
	 * @generated
	 */
	EClass getDate();

	/**
	 * Returns the meta object for class '{@link DML_DDL.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time</em>'.
	 * @see DML_DDL.Time
	 * @generated
	 */
	EClass getTime();

	/**
	 * Returns the meta object for class '{@link DML_DDL.Timestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timestamp</em>'.
	 * @see DML_DDL.Timestamp
	 * @generated
	 */
	EClass getTimestamp();

	/**
	 * Returns the meta object for class '{@link DML_DDL.Intervals <em>Intervals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intervals</em>'.
	 * @see DML_DDL.Intervals
	 * @generated
	 */
	EClass getIntervals();

	/**
	 * Returns the meta object for class '{@link DML_DDL.YearMonth <em>Year Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Year Month</em>'.
	 * @see DML_DDL.YearMonth
	 * @generated
	 */
	EClass getYearMonth();

	/**
	 * Returns the meta object for class '{@link DML_DDL.DayTime <em>Day Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Day Time</em>'.
	 * @see DML_DDL.DayTime
	 * @generated
	 */
	EClass getDayTime();

	/**
	 * Returns the meta object for class '{@link DML_DDL.Binaries <em>Binaries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binaries</em>'.
	 * @see DML_DDL.Binaries
	 * @generated
	 */
	EClass getBinaries();

	/**
	 * Returns the meta object for class '{@link DML_DDL.BinaryDouble <em>Binary Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Double</em>'.
	 * @see DML_DDL.BinaryDouble
	 * @generated
	 */
	EClass getBinaryDouble();

	/**
	 * Returns the meta object for class '{@link DML_DDL.BinaryFloat <em>Binary Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Float</em>'.
	 * @see DML_DDL.BinaryFloat
	 * @generated
	 */
	EClass getBinaryFloat();

	/**
	 * Returns the meta object for class '{@link DML_DDL.BFile <em>BFile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BFile</em>'.
	 * @see DML_DDL.BFile
	 * @generated
	 */
	EClass getBFile();

	/**
	 * Returns the meta object for class '{@link DML_DDL.Blob <em>Blob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blob</em>'.
	 * @see DML_DDL.Blob
	 * @generated
	 */
	EClass getBlob();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DML_DDLFactory getDML_DDLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link DML_DDL.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.StatementImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.DataDefinitionImpl <em>Data Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.DataDefinitionImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getDataDefinition()
		 * @generated
		 */
		EClass DATA_DEFINITION = eINSTANCE.getDataDefinition();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.DataTypeImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE__TYPES = eINSTANCE.getDataType_Types();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.DDLDefinitionImpl <em>DDL Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.DDLDefinitionImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getDDLDefinition()
		 * @generated
		 */
		EClass DDL_DEFINITION = eINSTANCE.getDDLDefinition();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDL_DEFINITION__STATEMENTS = eINSTANCE.getDDLDefinition_Statements();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DDL_DEFINITION__DATA_TYPE = eINSTANCE.getDDLDefinition_DataType();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.PkImpl <em>Pk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.PkImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getPk()
		 * @generated
		 */
		EClass PK = eINSTANCE.getPk();

		/**
		 * The meta object literal for the '<em><b>Name Pk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PK__NAME_PK = eINSTANCE.getPk_NamePk();

		/**
		 * The meta object literal for the '<em><b>Column Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PK__COLUMN_NAME = eINSTANCE.getPk_ColumnName();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.FkImpl <em>Fk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.FkImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getFk()
		 * @generated
		 */
		EClass FK = eINSTANCE.getFk();

		/**
		 * The meta object literal for the '<em><b>Name Fk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FK__NAME_FK = eINSTANCE.getFk_NameFk();

		/**
		 * The meta object literal for the '<em><b>Column Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FK__COLUMN_NAME = eINSTANCE.getFk_ColumnName();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FK__REFERENCES = eINSTANCE.getFk_References();

		/**
		 * The meta object literal for the '<em><b>Column Reference</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FK__COLUMN_REFERENCE = eINSTANCE.getFk_ColumnReference();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FK__STATUS = eINSTANCE.getFk_Status();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.CkImpl <em>Ck</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.CkImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getCk()
		 * @generated
		 */
		EClass CK = eINSTANCE.getCk();

		/**
		 * The meta object literal for the '<em><b>Name Ck</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CK__NAME_CK = eINSTANCE.getCk_NameCk();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CK__STATUS = eINSTANCE.getCk_Status();

		/**
		 * The meta object literal for the '<em><b>Values Ck</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CK__VALUES_CK = eINSTANCE.getCk_ValuesCk();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.ValuesCkImpl <em>Values Ck</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.ValuesCkImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getValuesCk()
		 * @generated
		 */
		EClass VALUES_CK = eINSTANCE.getValuesCk();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUES_CK__VALUE = eINSTANCE.getValuesCk_Value();

		/**
		 * The meta object literal for the '<em><b>Comparator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUES_CK__COMPARATOR = eINSTANCE.getValuesCk_Comparator();

		/**
		 * The meta object literal for the '<em><b>Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUES_CK__COLUMN_NAME = eINSTANCE.getValuesCk_ColumnName();

		/**
		 * The meta object literal for the '<em><b>Log Conjuntion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUES_CK__LOG_CONJUNTION = eINSTANCE.getValuesCk_LogConjuntion();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.ColumnImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__COLUMN_NAME = eINSTANCE.getColumn_ColumnName();

		/**
		 * The meta object literal for the '<em><b>Comment Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__COMMENT_COLUMN = eINSTANCE.getColumn_CommentColumn();

		/**
		 * The meta object literal for the '<em><b>Column Null</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__COLUMN_NULL = eINSTANCE.getColumn_ColumnNull();

		/**
		 * The meta object literal for the '<em><b>Column Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__COLUMN_TYPE = eINSTANCE.getColumn_ColumnType();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.DatabaseImpl <em>Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.DatabaseImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getDatabase()
		 * @generated
		 */
		EClass DATABASE = eINSTANCE.getDatabase();

		/**
		 * The meta object literal for the '<em><b>Database Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE__DATABASE_NAME = eINSTANCE.getDatabase_DatabaseName();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.TableImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__TABLE_NAME = eINSTANCE.getTable_TableName();

		/**
		 * The meta object literal for the '<em><b>Comment Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__COMMENT_TABLE = eINSTANCE.getTable_CommentTable();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__COLUMNS = eINSTANCE.getTable_Columns();

		/**
		 * The meta object literal for the '<em><b>Columns Pk</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__COLUMNS_PK = eINSTANCE.getTable_ColumnsPk();

		/**
		 * The meta object literal for the '<em><b>Columns Fk</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__COLUMNS_FK = eINSTANCE.getTable_ColumnsFk();

		/**
		 * The meta object literal for the '<em><b>Checks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__CHECKS = eINSTANCE.getTable_Checks();

		/**
		 * The meta object literal for the '<em><b>Registries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__REGISTRIES = eINSTANCE.getTable_Registries();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.RegistryImpl <em>Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.RegistryImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getRegistry()
		 * @generated
		 */
		EClass REGISTRY = eINSTANCE.getRegistry();

		/**
		 * The meta object literal for the '<em><b>Registry Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTRY__REGISTRY_VALUES = eINSTANCE.getRegistry_RegistryValues();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.ValueImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE__VALUE = eINSTANCE.getValue_Value();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE__COLUMN = eINSTANCE.getValue_Column();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.CommentTableImpl <em>Comment Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.CommentTableImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getCommentTable()
		 * @generated
		 */
		EClass COMMENT_TABLE = eINSTANCE.getCommentTable();

		/**
		 * The meta object literal for the '<em><b>Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT_TABLE__TABLE_NAME = eINSTANCE.getCommentTable_TableName();

		/**
		 * The meta object literal for the '<em><b>Table Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT_TABLE__TABLE_COMMENT = eINSTANCE.getCommentTable_TableComment();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.CommentColumnImpl <em>Comment Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.CommentColumnImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getCommentColumn()
		 * @generated
		 */
		EClass COMMENT_COLUMN = eINSTANCE.getCommentColumn();

		/**
		 * The meta object literal for the '<em><b>Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT_COLUMN__TABLE_NAME = eINSTANCE.getCommentColumn_TableName();

		/**
		 * The meta object literal for the '<em><b>Column Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT_COLUMN__COLUMN_NAME = eINSTANCE.getCommentColumn_ColumnName();

		/**
		 * The meta object literal for the '<em><b>Column Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT_COLUMN__COLUMN_COMMENT = eINSTANCE.getCommentColumn_ColumnComment();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.TypeImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__NAME = eINSTANCE.getType_Name();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.ExactoImpl <em>Exacto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.ExactoImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getExacto()
		 * @generated
		 */
		EClass EXACTO = eINSTANCE.getExacto();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.IntegerImpl <em>Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.IntegerImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getInteger()
		 * @generated
		 */
		EClass INTEGER = eINSTANCE.getInteger();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.SmallIntegerImpl <em>Small Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.SmallIntegerImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getSmallInteger()
		 * @generated
		 */
		EClass SMALL_INTEGER = eINSTANCE.getSmallInteger();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.IntImpl <em>Int</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.IntImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getInt()
		 * @generated
		 */
		EClass INT = eINSTANCE.getInt();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.SmallIntImpl <em>Small Int</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.SmallIntImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getSmallInt()
		 * @generated
		 */
		EClass SMALL_INT = eINSTANCE.getSmallInt();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.NumberImpl <em>Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.NumberImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getNumber()
		 * @generated
		 */
		EClass NUMBER = eINSTANCE.getNumber();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.NumericImpl <em>Numeric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.NumericImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getNumeric()
		 * @generated
		 */
		EClass NUMERIC = eINSTANCE.getNumeric();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.DecimalImpl <em>Decimal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.DecimalImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getDecimal()
		 * @generated
		 */
		EClass DECIMAL = eINSTANCE.getDecimal();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.AproximadoImpl <em>Aproximado</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.AproximadoImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getAproximado()
		 * @generated
		 */
		EClass APROXIMADO = eINSTANCE.getAproximado();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.RealImpl <em>Real</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.RealImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getReal()
		 * @generated
		 */
		EClass REAL = eINSTANCE.getReal();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.DoublePrecisionImpl <em>Double Precision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.DoublePrecisionImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getDoublePrecision()
		 * @generated
		 */
		EClass DOUBLE_PRECISION = eINSTANCE.getDoublePrecision();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.FloatImpl <em>Float</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.FloatImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getFloat()
		 * @generated
		 */
		EClass FLOAT = eINSTANCE.getFloat();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.LongImpl <em>Long</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.LongImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getLong()
		 * @generated
		 */
		EClass LONG = eINSTANCE.getLong();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.LongRawImpl <em>Long Raw</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.LongRawImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getLongRaw()
		 * @generated
		 */
		EClass LONG_RAW = eINSTANCE.getLongRaw();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.CharactersImpl <em>Characters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.CharactersImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getCharacters()
		 * @generated
		 */
		EClass CHARACTERS = eINSTANCE.getCharacters();

		/**
		 * The meta object literal for the '<em><b>N</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTERS__N = eINSTANCE.getCharacters_N();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.CharacterImpl <em>Character</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.CharacterImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getCharacter()
		 * @generated
		 */
		EClass CHARACTER = eINSTANCE.getCharacter();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.CharacterVaryingImpl <em>Character Varying</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.CharacterVaryingImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getCharacterVarying()
		 * @generated
		 */
		EClass CHARACTER_VARYING = eINSTANCE.getCharacterVarying();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.CharImpl <em>Char</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.CharImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getChar()
		 * @generated
		 */
		EClass CHAR = eINSTANCE.getChar();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.VarCharImpl <em>Var Char</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.VarCharImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getVarChar()
		 * @generated
		 */
		EClass VAR_CHAR = eINSTANCE.getVarChar();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.VarChar2Impl <em>Var Char2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.VarChar2Impl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getVarChar2()
		 * @generated
		 */
		EClass VAR_CHAR2 = eINSTANCE.getVarChar2();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.NVarChar2Impl <em>NVar Char2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.NVarChar2Impl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getNVarChar2()
		 * @generated
		 */
		EClass NVAR_CHAR2 = eINSTANCE.getNVarChar2();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.NCharImpl <em>NChar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.NCharImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getNChar()
		 * @generated
		 */
		EClass NCHAR = eINSTANCE.getNChar();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.CharVaryingImpl <em>Char Varying</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.CharVaryingImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getCharVarying()
		 * @generated
		 */
		EClass CHAR_VARYING = eINSTANCE.getCharVarying();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.NationalCharImpl <em>National Char</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.NationalCharImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getNationalChar()
		 * @generated
		 */
		EClass NATIONAL_CHAR = eINSTANCE.getNationalChar();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.NationalCharVaryingImpl <em>National Char Varying</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.NationalCharVaryingImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getNationalCharVarying()
		 * @generated
		 */
		EClass NATIONAL_CHAR_VARYING = eINSTANCE.getNationalCharVarying();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.NationalCharacterImpl <em>National Character</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.NationalCharacterImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getNationalCharacter()
		 * @generated
		 */
		EClass NATIONAL_CHARACTER = eINSTANCE.getNationalCharacter();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.NationalCharacterVaryingImpl <em>National Character Varying</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.NationalCharacterVaryingImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getNationalCharacterVarying()
		 * @generated
		 */
		EClass NATIONAL_CHARACTER_VARYING = eINSTANCE.getNationalCharacterVarying();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.NCharVaryingImpl <em>NChar Varying</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.NCharVaryingImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getNCharVarying()
		 * @generated
		 */
		EClass NCHAR_VARYING = eINSTANCE.getNCharVarying();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.ClobImpl <em>Clob</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.ClobImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getClob()
		 * @generated
		 */
		EClass CLOB = eINSTANCE.getClob();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.NClobImpl <em>NClob</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.NClobImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getNClob()
		 * @generated
		 */
		EClass NCLOB = eINSTANCE.getNClob();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.BitsImpl <em>Bits</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.BitsImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getBits()
		 * @generated
		 */
		EClass BITS = eINSTANCE.getBits();

		/**
		 * The meta object literal for the '<em><b>N</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BITS__N = eINSTANCE.getBits_N();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.BitImpl <em>Bit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.BitImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getBit()
		 * @generated
		 */
		EClass BIT = eINSTANCE.getBit();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.BitVaryingImpl <em>Bit Varying</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.BitVaryingImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getBitVarying()
		 * @generated
		 */
		EClass BIT_VARYING = eINSTANCE.getBitVarying();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.TimesImpl <em>Times</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.TimesImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getTimes()
		 * @generated
		 */
		EClass TIMES = eINSTANCE.getTimes();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.DateImpl <em>Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.DateImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getDate()
		 * @generated
		 */
		EClass DATE = eINSTANCE.getDate();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.TimeImpl <em>Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.TimeImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getTime()
		 * @generated
		 */
		EClass TIME = eINSTANCE.getTime();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.TimestampImpl <em>Timestamp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.TimestampImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getTimestamp()
		 * @generated
		 */
		EClass TIMESTAMP = eINSTANCE.getTimestamp();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.IntervalsImpl <em>Intervals</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.IntervalsImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getIntervals()
		 * @generated
		 */
		EClass INTERVALS = eINSTANCE.getIntervals();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.YearMonthImpl <em>Year Month</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.YearMonthImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getYearMonth()
		 * @generated
		 */
		EClass YEAR_MONTH = eINSTANCE.getYearMonth();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.DayTimeImpl <em>Day Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.DayTimeImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getDayTime()
		 * @generated
		 */
		EClass DAY_TIME = eINSTANCE.getDayTime();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.BinariesImpl <em>Binaries</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.BinariesImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getBinaries()
		 * @generated
		 */
		EClass BINARIES = eINSTANCE.getBinaries();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.BinaryDoubleImpl <em>Binary Double</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.BinaryDoubleImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getBinaryDouble()
		 * @generated
		 */
		EClass BINARY_DOUBLE = eINSTANCE.getBinaryDouble();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.BinaryFloatImpl <em>Binary Float</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.BinaryFloatImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getBinaryFloat()
		 * @generated
		 */
		EClass BINARY_FLOAT = eINSTANCE.getBinaryFloat();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.BFileImpl <em>BFile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.BFileImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getBFile()
		 * @generated
		 */
		EClass BFILE = eINSTANCE.getBFile();

		/**
		 * The meta object literal for the '{@link DML_DDL.impl.BlobImpl <em>Blob</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DML_DDL.impl.BlobImpl
		 * @see DML_DDL.impl.DML_DDLPackageImpl#getBlob()
		 * @generated
		 */
		EClass BLOB = eINSTANCE.getBlob();

	}

} //DML_DDLPackage
