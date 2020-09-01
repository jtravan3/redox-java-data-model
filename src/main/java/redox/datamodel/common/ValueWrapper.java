package redox.datamodel.common;

import lombok.Data;

/**
 * This is a wrapper class for Observation Value type. It can either be a Value or String
 * data type so this class provides the ability for it to be both
 */
@Data
public class ValueWrapper {
    private Value value;
    private String valueString;
}
