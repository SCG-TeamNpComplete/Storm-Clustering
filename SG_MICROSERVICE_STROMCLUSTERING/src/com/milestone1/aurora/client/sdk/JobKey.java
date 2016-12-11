/**
 * Autogenerated by Thrift Compiler (0.9.3)
 * <p>
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *
 * @generated
 */
package iu.edu.teambash.aurora.client.sdk;

import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;

import javax.annotation.Generated;
import java.util.*;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
/**
 * A unique identifier for a Job.
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-12-08")
public class JobKey implements org.apache.thrift.TBase<JobKey, JobKey._Fields>, java.io.Serializable, Cloneable, Comparable<JobKey> {
    // isset id assignments
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("JobKey");
    private static final org.apache.thrift.protocol.TField ROLE_FIELD_DESC = new org.apache.thrift.protocol.TField("role", org.apache.thrift.protocol.TType.STRING, (short) 1);
    private static final org.apache.thrift.protocol.TField ENVIRONMENT_FIELD_DESC = new org.apache.thrift.protocol.TField("environment", org.apache.thrift.protocol.TType.STRING, (short) 2);
    private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short) 3);
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();

    static {
        schemes.put(StandardScheme.class, new JobKeyStandardSchemeFactory());
        schemes.put(TupleScheme.class, new JobKeyTupleSchemeFactory());
    }

    static {
        Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
        tmpMap.put(_Fields.ROLE, new org.apache.thrift.meta_data.FieldMetaData("role", org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        tmpMap.put(_Fields.ENVIRONMENT, new org.apache.thrift.meta_data.FieldMetaData("environment", org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        metaDataMap = Collections.unmodifiableMap(tmpMap);
        org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(JobKey.class, metaDataMap);
    }

    /**
     * User role (Unix service account), for example "mesos"
     */
    public String role; // required
    /**
     * Environment, for example "devel"
     */
    public String environment; // required
    /**
     * Name, for example "labrat"
     */
    public String name; // required

    public JobKey() {
    }

    public JobKey(
            String role,
            String environment,
            String name) {
        this();
        this.role = role;
        this.environment = environment;
        this.name = name;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public JobKey(JobKey other) {
        if (other.isSetRole()) {
            this.role = other.role;
        }
        if (other.isSetEnvironment()) {
            this.environment = other.environment;
        }
        if (other.isSetName()) {
            this.name = other.name;
        }
    }

    public JobKey deepCopy() {
        return new JobKey(this);
    }

    @Override
    public void clear() {
        this.role = null;
        this.environment = null;
        this.name = null;
    }

    /**
     * User role (Unix service account), for example "mesos"
     */
    public String getRole() {
        return this.role;
    }

    /**
     * User role (Unix service account), for example "mesos"
     */
    public JobKey setRole(String role) {
        this.role = role;
        return this;
    }

    public void unsetRole() {
        this.role = null;
    }

    /**
     * Returns true if field role is set (has been assigned a value) and false otherwise
     */
    public boolean isSetRole() {
        return this.role != null;
    }

    public void setRoleIsSet(boolean value) {
        if (!value) {
            this.role = null;
        }
    }

    /**
     * Environment, for example "devel"
     */
    public String getEnvironment() {
        return this.environment;
    }

    /**
     * Environment, for example "devel"
     */
    public JobKey setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }

    public void unsetEnvironment() {
        this.environment = null;
    }

    /**
     * Returns true if field environment is set (has been assigned a value) and false otherwise
     */
    public boolean isSetEnvironment() {
        return this.environment != null;
    }

    public void setEnvironmentIsSet(boolean value) {
        if (!value) {
            this.environment = null;
        }
    }

    /**
     * Name, for example "labrat"
     */
    public String getName() {
        return this.name;
    }

    /**
     * Name, for example "labrat"
     */
    public JobKey setName(String name) {
        this.name = name;
        return this;
    }

    public void unsetName() {
        this.name = null;
    }

    /**
     * Returns true if field name is set (has been assigned a value) and false otherwise
     */
    public boolean isSetName() {
        return this.name != null;
    }

    public void setNameIsSet(boolean value) {
        if (!value) {
            this.name = null;
        }
    }

    public void setFieldValue(_Fields field, Object value) {
        switch (field) {
            case ROLE:
                if (value == null) {
                    unsetRole();
                } else {
                    setRole((String) value);
                }
                break;

            case ENVIRONMENT:
                if (value == null) {
                    unsetEnvironment();
                } else {
                    setEnvironment((String) value);
                }
                break;

            case NAME:
                if (value == null) {
                    unsetName();
                } else {
                    setName((String) value);
                }
                break;

        }
    }

    public Object getFieldValue(_Fields field) {
        switch (field) {
            case ROLE:
                return getRole();

            case ENVIRONMENT:
                return getEnvironment();

            case NAME:
                return getName();

        }
        throw new IllegalStateException();
    }

    /**
     * Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
     */
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }

        switch (field) {
            case ROLE:
                return isSetRole();
            case ENVIRONMENT:
                return isSetEnvironment();
            case NAME:
                return isSetName();
        }
        throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
        if (that == null)
            return false;
        if (that instanceof JobKey)
            return this.equals((JobKey) that);
        return false;
    }

    public boolean equals(JobKey that) {
        if (that == null)
            return false;

        boolean this_present_role = true && this.isSetRole();
        boolean that_present_role = true && that.isSetRole();
        if (this_present_role || that_present_role) {
            if (!(this_present_role && that_present_role))
                return false;
            if (!this.role.equals(that.role))
                return false;
        }

        boolean this_present_environment = true && this.isSetEnvironment();
        boolean that_present_environment = true && that.isSetEnvironment();
        if (this_present_environment || that_present_environment) {
            if (!(this_present_environment && that_present_environment))
                return false;
            if (!this.environment.equals(that.environment))
                return false;
        }

        boolean this_present_name = true && this.isSetName();
        boolean that_present_name = true && that.isSetName();
        if (this_present_name || that_present_name) {
            if (!(this_present_name && that_present_name))
                return false;
            if (!this.name.equals(that.name))
                return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        List<Object> list = new ArrayList<Object>();

        boolean present_role = true && (isSetRole());
        list.add(present_role);
        if (present_role)
            list.add(role);

        boolean present_environment = true && (isSetEnvironment());
        list.add(present_environment);
        if (present_environment)
            list.add(environment);

        boolean present_name = true && (isSetName());
        list.add(present_name);
        if (present_name)
            list.add(name);

        return list.hashCode();
    }

    @Override
    public int compareTo(JobKey other) {
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }

        int lastComparison = 0;

        lastComparison = Boolean.valueOf(isSetRole()).compareTo(other.isSetRole());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetRole()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.role, other.role);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetEnvironment()).compareTo(other.isSetEnvironment());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetEnvironment()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.environment, other.environment);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetName()).compareTo(other.isSetName());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetName()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        return 0;
    }

    public _Fields fieldForId(int fieldId) {
        return _Fields.findByThriftId(fieldId);
    }

    public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
        schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
        schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("JobKey(");
        boolean first = true;

        sb.append("role:");
        if (this.role == null) {
            sb.append("null");
        } else {
            sb.append(this.role);
        }
        first = false;
        if (!first) sb.append(", ");
        sb.append("environment:");
        if (this.environment == null) {
            sb.append("null");
        } else {
            sb.append(this.environment);
        }
        first = false;
        if (!first) sb.append(", ");
        sb.append("name:");
        if (this.name == null) {
            sb.append("null");
        } else {
            sb.append(this.name);
        }
        first = false;
        sb.append(")");
        return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
        // check for required fields
        // check for sub-struct validity
    }

    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        try {
            write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
        } catch (org.apache.thrift.TException te) {
            throw new java.io.IOException(te);
        }
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
        try {
            read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
        } catch (org.apache.thrift.TException te) {
            throw new java.io.IOException(te);
        }
    }

    /**
     * The set of fields this struct contains, along with convenience methods for finding and manipulating them.
     */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
        /**
         * User role (Unix service account), for example "mesos"
         */
        ROLE((short) 1, "role"),
        /**
         * Environment, for example "devel"
         */
        ENVIRONMENT((short) 2, "environment"),
        /**
         * Name, for example "labrat"
         */
        NAME((short) 3, "name");

        private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

        static {
            for (_Fields field : EnumSet.allOf(_Fields.class)) {
                byName.put(field.getFieldName(), field);
            }
        }

        private final short _thriftId;
        private final String _fieldName;

        _Fields(short thriftId, String fieldName) {
            _thriftId = thriftId;
            _fieldName = fieldName;
        }

        /**
         * Find the _Fields constant that matches fieldId, or null if its not found.
         */
        public static _Fields findByThriftId(int fieldId) {
            switch (fieldId) {
                case 1: // ROLE
                    return ROLE;
                case 2: // ENVIRONMENT
                    return ENVIRONMENT;
                case 3: // NAME
                    return NAME;
                default:
                    return null;
            }
        }

        /**
         * Find the _Fields constant that matches fieldId, throwing an exception
         * if it is not found.
         */
        public static _Fields findByThriftIdOrThrow(int fieldId) {
            _Fields fields = findByThriftId(fieldId);
            if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            return fields;
        }

        /**
         * Find the _Fields constant that matches name, or null if its not found.
         */
        public static _Fields findByName(String name) {
            return byName.get(name);
        }

        public short getThriftFieldId() {
            return _thriftId;
        }

        public String getFieldName() {
            return _fieldName;
        }
    }

    private static class JobKeyStandardSchemeFactory implements SchemeFactory {
        public JobKeyStandardScheme getScheme() {
            return new JobKeyStandardScheme();
        }
    }

    private static class JobKeyStandardScheme extends StandardScheme<JobKey> {

        public void read(org.apache.thrift.protocol.TProtocol iprot, JobKey struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();
            while (true) {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                    break;
                }
                switch (schemeField.id) {
                    case 1: // ROLE
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.role = iprot.readString();
                            struct.setRoleIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 2: // ENVIRONMENT
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.environment = iprot.readString();
                            struct.setEnvironmentIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 3: // NAME
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.name = iprot.readString();
                            struct.setNameIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    default:
                        org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();

            // check for required fields of primitive type, which can't be checked in the validate method
            struct.validate();
        }

        public void write(org.apache.thrift.protocol.TProtocol oprot, JobKey struct) throws org.apache.thrift.TException {
            struct.validate();

            oprot.writeStructBegin(STRUCT_DESC);
            if (struct.role != null) {
                oprot.writeFieldBegin(ROLE_FIELD_DESC);
                oprot.writeString(struct.role);
                oprot.writeFieldEnd();
            }
            if (struct.environment != null) {
                oprot.writeFieldBegin(ENVIRONMENT_FIELD_DESC);
                oprot.writeString(struct.environment);
                oprot.writeFieldEnd();
            }
            if (struct.name != null) {
                oprot.writeFieldBegin(NAME_FIELD_DESC);
                oprot.writeString(struct.name);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }

    }

    private static class JobKeyTupleSchemeFactory implements SchemeFactory {
        public JobKeyTupleScheme getScheme() {
            return new JobKeyTupleScheme();
        }
    }

    private static class JobKeyTupleScheme extends TupleScheme<JobKey> {

        @Override
        public void write(org.apache.thrift.protocol.TProtocol prot, JobKey struct) throws org.apache.thrift.TException {
            TTupleProtocol oprot = (TTupleProtocol) prot;
            BitSet optionals = new BitSet();
            if (struct.isSetRole()) {
                optionals.set(0);
            }
            if (struct.isSetEnvironment()) {
                optionals.set(1);
            }
            if (struct.isSetName()) {
                optionals.set(2);
            }
            oprot.writeBitSet(optionals, 3);
            if (struct.isSetRole()) {
                oprot.writeString(struct.role);
            }
            if (struct.isSetEnvironment()) {
                oprot.writeString(struct.environment);
            }
            if (struct.isSetName()) {
                oprot.writeString(struct.name);
            }
        }

        @Override
        public void read(org.apache.thrift.protocol.TProtocol prot, JobKey struct) throws org.apache.thrift.TException {
            TTupleProtocol iprot = (TTupleProtocol) prot;
            BitSet incoming = iprot.readBitSet(3);
            if (incoming.get(0)) {
                struct.role = iprot.readString();
                struct.setRoleIsSet(true);
            }
            if (incoming.get(1)) {
                struct.environment = iprot.readString();
                struct.setEnvironmentIsSet(true);
            }
            if (incoming.get(2)) {
                struct.name = iprot.readString();
                struct.setNameIsSet(true);
            }
        }
    }

}

