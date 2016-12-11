/**
 * Autogenerated by Thrift Compiler (0.9.3)
 * <p>
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *
 * @generated
 */
package iu.edu.teambash.aurora.client.sdk;

import org.apache.thrift.EncodingUtils;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;

import javax.annotation.Generated;
import java.util.*;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
/**
 * Current job update state including status and created/modified timestamps.
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-12-08")
public class JobUpdateState implements org.apache.thrift.TBase<JobUpdateState, JobUpdateState._Fields>, java.io.Serializable, Cloneable, Comparable<JobUpdateState> {
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("JobUpdateState");
    private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.I32, (short) 1);
    private static final org.apache.thrift.protocol.TField CREATED_TIMESTAMP_MS_FIELD_DESC = new org.apache.thrift.protocol.TField("createdTimestampMs", org.apache.thrift.protocol.TType.I64, (short) 2);
    private static final org.apache.thrift.protocol.TField LAST_MODIFIED_TIMESTAMP_MS_FIELD_DESC = new org.apache.thrift.protocol.TField("lastModifiedTimestampMs", org.apache.thrift.protocol.TType.I64, (short) 3);
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    // isset id assignments
    private static final int __CREATEDTIMESTAMPMS_ISSET_ID = 0;
    private static final int __LASTMODIFIEDTIMESTAMPMS_ISSET_ID = 1;

    static {
        schemes.put(StandardScheme.class, new JobUpdateStateStandardSchemeFactory());
        schemes.put(TupleScheme.class, new JobUpdateStateTupleSchemeFactory());
    }

    static {
        Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
        tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, JobUpdateStatus.class)));
        tmpMap.put(_Fields.CREATED_TIMESTAMP_MS, new org.apache.thrift.meta_data.FieldMetaData("createdTimestampMs", org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
        tmpMap.put(_Fields.LAST_MODIFIED_TIMESTAMP_MS, new org.apache.thrift.meta_data.FieldMetaData("lastModifiedTimestampMs", org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
        metaDataMap = Collections.unmodifiableMap(tmpMap);
        org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(JobUpdateState.class, metaDataMap);
    }

    /**
     * Current status of the update.
     *
     * @see JobUpdateStatus
     */
    public JobUpdateStatus status; // required
    /**
     * Created timestamp in milliseconds.
     */
    public long createdTimestampMs; // required
    /**
     * Last modified timestamp in milliseconds.
     */
    public long lastModifiedTimestampMs; // required
    private byte __isset_bitfield = 0;

    public JobUpdateState() {
    }

    public JobUpdateState(
            JobUpdateStatus status,
            long createdTimestampMs,
            long lastModifiedTimestampMs) {
        this();
        this.status = status;
        this.createdTimestampMs = createdTimestampMs;
        setCreatedTimestampMsIsSet(true);
        this.lastModifiedTimestampMs = lastModifiedTimestampMs;
        setLastModifiedTimestampMsIsSet(true);
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public JobUpdateState(JobUpdateState other) {
        __isset_bitfield = other.__isset_bitfield;
        if (other.isSetStatus()) {
            this.status = other.status;
        }
        this.createdTimestampMs = other.createdTimestampMs;
        this.lastModifiedTimestampMs = other.lastModifiedTimestampMs;
    }

    public JobUpdateState deepCopy() {
        return new JobUpdateState(this);
    }

    @Override
    public void clear() {
        this.status = null;
        setCreatedTimestampMsIsSet(false);
        this.createdTimestampMs = 0;
        setLastModifiedTimestampMsIsSet(false);
        this.lastModifiedTimestampMs = 0;
    }

    /**
     * Current status of the update.
     *
     * @see JobUpdateStatus
     */
    public JobUpdateStatus getStatus() {
        return this.status;
    }

    /**
     * Current status of the update.
     *
     * @see JobUpdateStatus
     */
    public JobUpdateState setStatus(JobUpdateStatus status) {
        this.status = status;
        return this;
    }

    public void unsetStatus() {
        this.status = null;
    }

    /**
     * Returns true if field status is set (has been assigned a value) and false otherwise
     */
    public boolean isSetStatus() {
        return this.status != null;
    }

    public void setStatusIsSet(boolean value) {
        if (!value) {
            this.status = null;
        }
    }

    /**
     * Created timestamp in milliseconds.
     */
    public long getCreatedTimestampMs() {
        return this.createdTimestampMs;
    }

    /**
     * Created timestamp in milliseconds.
     */
    public JobUpdateState setCreatedTimestampMs(long createdTimestampMs) {
        this.createdTimestampMs = createdTimestampMs;
        setCreatedTimestampMsIsSet(true);
        return this;
    }

    public void unsetCreatedTimestampMs() {
        __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CREATEDTIMESTAMPMS_ISSET_ID);
    }

    /**
     * Returns true if field createdTimestampMs is set (has been assigned a value) and false otherwise
     */
    public boolean isSetCreatedTimestampMs() {
        return EncodingUtils.testBit(__isset_bitfield, __CREATEDTIMESTAMPMS_ISSET_ID);
    }

    public void setCreatedTimestampMsIsSet(boolean value) {
        __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CREATEDTIMESTAMPMS_ISSET_ID, value);
    }

    /**
     * Last modified timestamp in milliseconds.
     */
    public long getLastModifiedTimestampMs() {
        return this.lastModifiedTimestampMs;
    }

    /**
     * Last modified timestamp in milliseconds.
     */
    public JobUpdateState setLastModifiedTimestampMs(long lastModifiedTimestampMs) {
        this.lastModifiedTimestampMs = lastModifiedTimestampMs;
        setLastModifiedTimestampMsIsSet(true);
        return this;
    }

    public void unsetLastModifiedTimestampMs() {
        __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LASTMODIFIEDTIMESTAMPMS_ISSET_ID);
    }

    /**
     * Returns true if field lastModifiedTimestampMs is set (has been assigned a value) and false otherwise
     */
    public boolean isSetLastModifiedTimestampMs() {
        return EncodingUtils.testBit(__isset_bitfield, __LASTMODIFIEDTIMESTAMPMS_ISSET_ID);
    }

    public void setLastModifiedTimestampMsIsSet(boolean value) {
        __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LASTMODIFIEDTIMESTAMPMS_ISSET_ID, value);
    }

    public void setFieldValue(_Fields field, Object value) {
        switch (field) {
            case STATUS:
                if (value == null) {
                    unsetStatus();
                } else {
                    setStatus((JobUpdateStatus) value);
                }
                break;

            case CREATED_TIMESTAMP_MS:
                if (value == null) {
                    unsetCreatedTimestampMs();
                } else {
                    setCreatedTimestampMs((Long) value);
                }
                break;

            case LAST_MODIFIED_TIMESTAMP_MS:
                if (value == null) {
                    unsetLastModifiedTimestampMs();
                } else {
                    setLastModifiedTimestampMs((Long) value);
                }
                break;

        }
    }

    public Object getFieldValue(_Fields field) {
        switch (field) {
            case STATUS:
                return getStatus();

            case CREATED_TIMESTAMP_MS:
                return getCreatedTimestampMs();

            case LAST_MODIFIED_TIMESTAMP_MS:
                return getLastModifiedTimestampMs();

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
            case STATUS:
                return isSetStatus();
            case CREATED_TIMESTAMP_MS:
                return isSetCreatedTimestampMs();
            case LAST_MODIFIED_TIMESTAMP_MS:
                return isSetLastModifiedTimestampMs();
        }
        throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
        if (that == null)
            return false;
        if (that instanceof JobUpdateState)
            return this.equals((JobUpdateState) that);
        return false;
    }

    public boolean equals(JobUpdateState that) {
        if (that == null)
            return false;

        boolean this_present_status = true && this.isSetStatus();
        boolean that_present_status = true && that.isSetStatus();
        if (this_present_status || that_present_status) {
            if (!(this_present_status && that_present_status))
                return false;
            if (!this.status.equals(that.status))
                return false;
        }

        boolean this_present_createdTimestampMs = true;
        boolean that_present_createdTimestampMs = true;
        if (this_present_createdTimestampMs || that_present_createdTimestampMs) {
            if (!(this_present_createdTimestampMs && that_present_createdTimestampMs))
                return false;
            if (this.createdTimestampMs != that.createdTimestampMs)
                return false;
        }

        boolean this_present_lastModifiedTimestampMs = true;
        boolean that_present_lastModifiedTimestampMs = true;
        if (this_present_lastModifiedTimestampMs || that_present_lastModifiedTimestampMs) {
            if (!(this_present_lastModifiedTimestampMs && that_present_lastModifiedTimestampMs))
                return false;
            if (this.lastModifiedTimestampMs != that.lastModifiedTimestampMs)
                return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        List<Object> list = new ArrayList<Object>();

        boolean present_status = true && (isSetStatus());
        list.add(present_status);
        if (present_status)
            list.add(status.getValue());

        boolean present_createdTimestampMs = true;
        list.add(present_createdTimestampMs);
        if (present_createdTimestampMs)
            list.add(createdTimestampMs);

        boolean present_lastModifiedTimestampMs = true;
        list.add(present_lastModifiedTimestampMs);
        if (present_lastModifiedTimestampMs)
            list.add(lastModifiedTimestampMs);

        return list.hashCode();
    }

    @Override
    public int compareTo(JobUpdateState other) {
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }

        int lastComparison = 0;

        lastComparison = Boolean.valueOf(isSetStatus()).compareTo(other.isSetStatus());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetStatus()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, other.status);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetCreatedTimestampMs()).compareTo(other.isSetCreatedTimestampMs());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetCreatedTimestampMs()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.createdTimestampMs, other.createdTimestampMs);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetLastModifiedTimestampMs()).compareTo(other.isSetLastModifiedTimestampMs());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetLastModifiedTimestampMs()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lastModifiedTimestampMs, other.lastModifiedTimestampMs);
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
        StringBuilder sb = new StringBuilder("JobUpdateState(");
        boolean first = true;

        sb.append("status:");
        if (this.status == null) {
            sb.append("null");
        } else {
            sb.append(this.status);
        }
        first = false;
        if (!first) sb.append(", ");
        sb.append("createdTimestampMs:");
        sb.append(this.createdTimestampMs);
        first = false;
        if (!first) sb.append(", ");
        sb.append("lastModifiedTimestampMs:");
        sb.append(this.lastModifiedTimestampMs);
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
            // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
            __isset_bitfield = 0;
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
         * Current status of the update.
         *
         * @see JobUpdateStatus
         */
        STATUS((short) 1, "status"),
        /**
         * Created timestamp in milliseconds.
         */
        CREATED_TIMESTAMP_MS((short) 2, "createdTimestampMs"),
        /**
         * Last modified timestamp in milliseconds.
         */
        LAST_MODIFIED_TIMESTAMP_MS((short) 3, "lastModifiedTimestampMs");

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
                case 1: // STATUS
                    return STATUS;
                case 2: // CREATED_TIMESTAMP_MS
                    return CREATED_TIMESTAMP_MS;
                case 3: // LAST_MODIFIED_TIMESTAMP_MS
                    return LAST_MODIFIED_TIMESTAMP_MS;
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

    private static class JobUpdateStateStandardSchemeFactory implements SchemeFactory {
        public JobUpdateStateStandardScheme getScheme() {
            return new JobUpdateStateStandardScheme();
        }
    }

    private static class JobUpdateStateStandardScheme extends StandardScheme<JobUpdateState> {

        public void read(org.apache.thrift.protocol.TProtocol iprot, JobUpdateState struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();
            while (true) {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                    break;
                }
                switch (schemeField.id) {
                    case 1: // STATUS
                        if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
                            struct.status = iu.edu.teambash.aurora.client.sdk.JobUpdateStatus.findByValue(iprot.readI32());
                            struct.setStatusIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 2: // CREATED_TIMESTAMP_MS
                        if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
                            struct.createdTimestampMs = iprot.readI64();
                            struct.setCreatedTimestampMsIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 3: // LAST_MODIFIED_TIMESTAMP_MS
                        if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
                            struct.lastModifiedTimestampMs = iprot.readI64();
                            struct.setLastModifiedTimestampMsIsSet(true);
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

        public void write(org.apache.thrift.protocol.TProtocol oprot, JobUpdateState struct) throws org.apache.thrift.TException {
            struct.validate();

            oprot.writeStructBegin(STRUCT_DESC);
            if (struct.status != null) {
                oprot.writeFieldBegin(STATUS_FIELD_DESC);
                oprot.writeI32(struct.status.getValue());
                oprot.writeFieldEnd();
            }
            oprot.writeFieldBegin(CREATED_TIMESTAMP_MS_FIELD_DESC);
            oprot.writeI64(struct.createdTimestampMs);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(LAST_MODIFIED_TIMESTAMP_MS_FIELD_DESC);
            oprot.writeI64(struct.lastModifiedTimestampMs);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }

    }

    private static class JobUpdateStateTupleSchemeFactory implements SchemeFactory {
        public JobUpdateStateTupleScheme getScheme() {
            return new JobUpdateStateTupleScheme();
        }
    }

    private static class JobUpdateStateTupleScheme extends TupleScheme<JobUpdateState> {

        @Override
        public void write(org.apache.thrift.protocol.TProtocol prot, JobUpdateState struct) throws org.apache.thrift.TException {
            TTupleProtocol oprot = (TTupleProtocol) prot;
            BitSet optionals = new BitSet();
            if (struct.isSetStatus()) {
                optionals.set(0);
            }
            if (struct.isSetCreatedTimestampMs()) {
                optionals.set(1);
            }
            if (struct.isSetLastModifiedTimestampMs()) {
                optionals.set(2);
            }
            oprot.writeBitSet(optionals, 3);
            if (struct.isSetStatus()) {
                oprot.writeI32(struct.status.getValue());
            }
            if (struct.isSetCreatedTimestampMs()) {
                oprot.writeI64(struct.createdTimestampMs);
            }
            if (struct.isSetLastModifiedTimestampMs()) {
                oprot.writeI64(struct.lastModifiedTimestampMs);
            }
        }

        @Override
        public void read(org.apache.thrift.protocol.TProtocol prot, JobUpdateState struct) throws org.apache.thrift.TException {
            TTupleProtocol iprot = (TTupleProtocol) prot;
            BitSet incoming = iprot.readBitSet(3);
            if (incoming.get(0)) {
                struct.status = iu.edu.teambash.aurora.client.sdk.JobUpdateStatus.findByValue(iprot.readI32());
                struct.setStatusIsSet(true);
            }
            if (incoming.get(1)) {
                struct.createdTimestampMs = iprot.readI64();
                struct.setCreatedTimestampMsIsSet(true);
            }
            if (incoming.get(2)) {
                struct.lastModifiedTimestampMs = iprot.readI64();
                struct.setLastModifiedTimestampMsIsSet(true);
            }
        }
    }

}

