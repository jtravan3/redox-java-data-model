package redox.datamodel;

import com.openpojo.reflection.PojoClass;
import com.openpojo.reflection.filters.FilterPackageInfo;
import com.openpojo.reflection.impl.PojoClassFactory;
import com.openpojo.validation.Validator;
import com.openpojo.validation.ValidatorBuilder;
import com.openpojo.validation.affirm.Affirm;
import com.openpojo.validation.rule.impl.NoFieldShadowingRule;
import com.openpojo.validation.rule.impl.NoNestedClassRule;
import com.openpojo.validation.rule.impl.NoPublicFieldsExceptStaticFinalRule;
import com.openpojo.validation.rule.impl.NoStaticExceptFinalRule;
import com.openpojo.validation.test.impl.GetterTester;
import com.openpojo.validation.test.impl.SetterTester;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class DataModelTest {

    private static final String POJO_CLASSES = "redox.datamodel";
    private List<PojoClass> pojoClasses;

    @Before
    public void initialize() {
        pojoClasses = PojoClassFactory.getPojoClassesRecursively(POJO_CLASSES, new FilterPackageInfo());
    }

    @Test
    public void ensureExpectedPojoCount_ClinicalSummary_Common() {
        Affirm.affirmEquals("Classes added / removed?", 145, pojoClasses.size());
    }

    @Test
    public void testPojoStructureAndBehavior_ClinicalSummary_Common() {
        Validator validator = ValidatorBuilder.create()
                .with(new CanCreateObjectRule())
                .with(new NoFieldShadowingRule())
                .with(new NoPublicFieldsExceptStaticFinalRule())
                .with(new SetterTester())
                .with(new GetterTester())
                .with(new NoStaticExceptFinalRule())
                .with(new NoNestedClassRule())
                .build();

        validator.validate(pojoClasses);
    }
}