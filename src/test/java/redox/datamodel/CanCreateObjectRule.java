package redox.datamodel;

import com.openpojo.reflection.PojoClass;
import com.openpojo.validation.affirm.Affirm;
import com.openpojo.validation.rule.Rule;
import com.openpojo.validation.utils.ValidationHelper;

public class CanCreateObjectRule implements Rule {

    public void evaluate(final PojoClass pojoClass) {
        Affirm.affirmNotNull("Cannot create object from class", ValidationHelper.getBasicInstance(pojoClass));
    }
}

