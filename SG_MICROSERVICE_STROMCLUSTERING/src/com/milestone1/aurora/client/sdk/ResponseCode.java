/**
 * Autogenerated by Thrift Compiler (0.9.3)
 * <p>
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *
 * @generated
 */
package iu.edu.teambash.aurora.client.sdk;


public enum ResponseCode implements org.apache.thrift.TEnum {
    INVALID_REQUEST(0),
    OK(1),
    ERROR(2),
    WARNING(3),
    AUTH_FAILED(4),
    /**
     * Raised when a Lock-protected operation failed due to lock validation.
     */
    LOCK_ERROR(5),
    /**
     * Raised when a scheduler is transiently unavailable and later retry is recommended.
     */
    ERROR_TRANSIENT(6);

    private final int value;

    private ResponseCode(int value) {
        this.value = value;
    }

    /**
     * Find a the enum type by its integer value, as defined in the Thrift IDL.
     *
     * @return null if the value is not found.
     */
    public static ResponseCode findByValue(int value) {
        switch (value) {
            case 0:
                return INVALID_REQUEST;
            case 1:
                return OK;
            case 2:
                return ERROR;
            case 3:
                return WARNING;
            case 4:
                return AUTH_FAILED;
            case 5:
                return LOCK_ERROR;
            case 6:
                return ERROR_TRANSIENT;
            default:
                return null;
        }
    }

    /**
     * Get the integer value of this enum value, as defined in the Thrift IDL.
     */
    public int getValue() {
        return value;
    }
}
