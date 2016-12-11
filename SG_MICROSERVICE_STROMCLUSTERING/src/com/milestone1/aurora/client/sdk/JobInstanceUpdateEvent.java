/**
 * Autogenerated by Thrift Compiler (0.9.3)
 * <p>
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *
 * @generated
 */
package com.milestone1.aurora.client.sdk;

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
 * Event marking a state transition in job instance update lifecycle.
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-12-08")
public class JobInstanceUpdateEvent implements org.apache.thrift.TBase<JobInstanceUpdateEvent, JobInstanceUpdateEvent._Fields>, java.io.Serializable, Cloneable, Comparable<JobInstanceUpdateEvent> {
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("JobInstanceUpdateEvent");
    private static final org.apache.thrift.protocol.TField INSTANCE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("instanceId", org.apache.thrift.protocol.TType.I32, (short) 1);
    private static final org.apache.thrift.protocol.TField TIMESTAMP_MS_FIELD_DESC = new org.apache.thrift.protocol.TField("timestampMs", org.apache.thrift.protocol.TType.I64, (short) 2);
    private static final org.apache.thrift.protocol.TField ACTION_FIELD_DESC = new org.apache.thrift.protocol.TField("action", org.apache.thrift.protocol.TType.I32, (short) 3);
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    // isset id assignments
    private static final int __INSTANCEID_ISSET_ID = 0;
    private static final int __TIMESTAMPMS_ISSET_ID = 1;

    static {
        schemes.put(StandardScheme.class, new JobInstanceUpdateEventStandardSchemeFactory());
        schemes.put(TupleScheme.class, new JobInstanceUpdateEventTupleSchemeFactory());
    }

    static {
        Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
        tmpMap.put(_Fields.INSTANCE_ID, new org.apache.thrift.meta_data.FieldMetaData("instanceId", org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
        tmpMap.put(_Fields.TIMESTAMP_MS, new org.apache.thrift.meta_data.FieldMetaData("timestampMs", org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
        tmpMap.put(_Fields.ACTION, new org.apache.thrift.meta_data.FieldMetaData("action", org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, JobUpdateAction.class)));
        metaDataMap = Collections.unmodifiableMap(tmpMap);
        org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(JobInstanceUpdateEvent.class, metaDataMap);
    }

    /**
     * Job instance ID.
     */
    public int instanceId; // required
    /**
     * Epoch timestamp in milliseconds.
     */
    public long timestampMs; // required
    /**
     * Job update action taken on the instance.
     *
     * @see JobUpdateAction
     */
    public JobUpdateAction action; // required
    private byte __isset_bitfield = 0;

    public JobInstanceUpdateEvent() {
    }

    public JobInstanceUpdateEvent(
            int instanceId,
            long timestampMs,
            JobUpdateAction action) {
        this();
        this.instanceId = instanceId;
        setInstanceIdIsSet(true);
        this.timestampMs = timestampMs;
        setTimestampMsIsSet(true);
        this.action = action;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public JobInstanceUpdateEvent(JobInstanceUpdateEvent other) {
        __isset_bitfield = other.__isset_bitfield;
        this.instanceId = other.instanceId;
        this.timestampMs = other.timestampMs;
        if (other.isSetAction()) {
            this.action = other.action;
        }
    }

    public JobInstanceUpdateEvent deepCopy() {
        return new JobInstanceUpdateEvent(this);
    }

    @Override
    public void clear() {
        setInstanceIdIsSet(false);
        this.instanceId = 0;
        setTimestampMsIsSet(false);
        this.timestampMs = 0;
        this.action = null;
    }

    /**
     * Job instance ID.
     */
    public int getInstanceId() {
        return this.instanceId;
    }

    /**
     * Job instance ID.
     */
    public JobInstanceUpdateEvent setInstanceId(int instanceId) {
        this.instanceId = instanceId;
        setInstanceIdIsSet(true);
        return this;
    }

    public void unsetInstanceId() {
        __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __INSTANCEID_ISSET_ID);
    }

    /**
     * Returns true if field instanceId is set (has been assigned a value) and false otherwise
     */
    public boolean isSetInstanceId() {
        return EncodingUtils.testBit(__isset_bitfield, __INSTANCEID_ISSET_ID);
    }

    public void setInstanceIdIsSet(boolean value) {
        __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __INSTANCEID_ISSET_ID, value);
    }

    /**
     * Epoch timestamp in milliseconds.
     */
    public long getTimestampMs() {
        return this.timestampMs;
    }

    /**
     * Epoch timestamp in milliseconds.
     */
    public JobInstanceUpdateEvent setTimestampMs(long timestampMs) {
        this.timestampMs = timestampMs;
        setTimestampMsIsSet(true);
        return this;
    }

    public void unsetTimestampMs() {
        __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TIMESTAMPMS_ISSET_ID);
    }

    /**
     * Returns true if field timestampMs is set (has been assigned a value) and false otherwise
     */
    public boolean isSetTimestampMs() {
        return EncodingUtils.testBit(__isset_bitfield, __TIMESTAMPMS_ISSET_ID);
    }

    public void setTimestampMsIsSet(boolean value) {
        __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TIMESTAMPMS_ISSET_ID, value);
    }

    /**
     * Job update action taken on the instance.
     *
     * @see JobUpdateAction
     */
    public JobUpdateAction getAction() {
        return this.action;
    }

    /**
     * Job update action taken on the instance.
     *
     * @see JobUpdateAction
     */
    public JobInstanceUpdateEvent setAction(JobUpdateAction action) {
        this.action = action;
        return this;
    }

    public void unsetAction() {
        this.action = null;
    }

    /**
     * Returns true if field action is set (has been assigned a value) and false otherwise
     */
    public boolean isSetAction() {
        return this.action != null;
    }

    public void setActionIsSet(boolean value) {
        if (!value) {
            this.action = null;
        }
    }

    public void setFieldValue(_Fields field, Object value) {
        switch (field) {
            case INSTANCE_ID:
                if (value == null) {
                    unsetInstanceId();
                } else {
                    setInstanceId((Integer) value);
                }
                break;

            case TIMESTAMP_MS:
                if (value == null) {
                    unsetTimestampMs();
                } else {
                    setTimestampMs((Long) value);
                }
                break;

            case ACTION:
                if (value == null) {
                    unsetAction();
                } else {
                    setAction((JobUpdateAction) value);
                }
                break;

        }
    }

    public Object getFieldValue(_Fields field) {
        switch (field) {
            case INSTANCE_ID:
                return getInstanceId();

            case TIMESTAMP_MS:
                return getTimestampMs();

            case ACTION:
                return getAction();

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
            case INSTANCE_ID:
                return isSetInstanceId();
            case TIMESTAMP_MS:
                return isSetTimestampMs();
            case ACTION:
                return isSetAction();
        }
        throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
        if (that == null)
            return false;
        if (that instanceof JobInstanceUpdateEvent)
            return this.equals((JobInstanceUpdateEvent) that);
        return false;
    }

    public boolean equals(JobInstanceUpdateEvent that) {
        if (that == null)
            return false;

        boolean this_present_instanceId = true;
        boolean that_present_instanceId = true;
        if (this_present_instanceId || that_present_instanceId) {
            if (!(this_present_instanceId && that_present_instanceId))
                return false;
            if (this.instanceId != that.instanceId)
                return false;
        }

        boolean this_present_timestampMs = true;
        boolean that_present_timestampMs = true;
        if (this_present_timestampMs || that_present_timestampMs) {
            if (!(this_present_timestampMs && that_present_timestampMs))
                return false;
            if (this.timestampMs != that.timestampMs)
                return false;
        }

        boolean this_present_action = true && this.isSetAction();
        boolean that_present_action = true && that.isSetAction();
        if (this_present_action || that_present_action) {
            if (!(this_present_action && that_present_action))
                return false;
            if (!this.action.equals(that.action))
                return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        List<Object> list = new ArrayList<Object>();

        boolean present_instanceId = true;
        list.add(present_instanceId);
        if (present_instanceId)
            list.add(instanceId);

        boolean present_timestampMs = true;
        list.add(present_timestampMs);
        if (present_timestampMs)
            list.add(timestampMs);

        boolean present_action = true && (isSetAction());
        list.add(present_action);
        if (present_action)
            list.add(action.getValue());

        return list.hashCode();
    }

    @Override
    public int compareTo(JobInstanceUpdateEvent other) {
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }

        int lastComparison = 0;

        lastComparison = Boolean.valueOf(isSetInstanceId()).compareTo(other.isSetInstanceId());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetInstanceId()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.instanceId, other.instanceId);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetTimestampMs()).compareTo(other.isSetTimestampMs());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetTimestampMs()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.timestampMs, other.timestampMs);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetAction()).compareTo(other.isSetAction());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetAction()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.action, other.action);
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
        StringBuilder sb = new StringBuilder("JobInstanceUpdateEvent(");
        boolean first = true;

        sb.append("instanceId:");
        sb.append(this.instanceId);
        first = false;
        if (!first) sb.append(", ");
        sb.append("timestampMs:");
        sb.append(this.timestampMs);
        first = false;
        if (!first) sb.append(", ");
        sb.append("action:");
        if (this.action == null) {
            sb.append("null");
        } else {
            sb.append(this.action);
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
         * Job instance ID.
         */
        INSTANCE_ID((short) 1, "instanceId"),
        /**
         * Epoch timestamp in milliseconds.
         */
        TIMESTAMP_MS((short) 2, "timestampMs"),
        /**
         * Job update action taken on the instance.
         *
         * @see JobUpdateAction
         */
        ACTION((short) 3, "action");

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
                case 1: // INSTANCE_ID
                    return INSTANCE_ID;
                case 2: // TIMESTAMP_MS
                    return TIMESTAMP_MS;
                case 3: // ACTION
                    return ACTION;
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

    private static class JobInstanceUpdateEventStandardSchemeFactory implements SchemeFactory {
        public JobInstanceUpdateEventStandardScheme getScheme() {
            return new JobInstanceUpdateEventStandardScheme();
        }
    }

    private static class JobInstanceUpdateEventStandardScheme extends StandardScheme<JobInstanceUpdateEvent> {

        public void read(org.apache.thrift.protocol.TProtocol iprot, JobInstanceUpdateEvent struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();
            while (true) {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                    break;
                }
                switch (schemeField.id) {
                    case 1: // INSTANCE_ID
                        if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
                            struct.instanceId = iprot.readI32();
                            struct.setInstanceIdIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 2: // TIMESTAMP_MS
                        if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
                            struct.timestampMs = iprot.readI64();
                            struct.setTimestampMsIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 3: // ACTION
                        if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
                            struct.action = com.milestone1.aurora.client.sdk.JobUpdateAction.findByValue(iprot.readI32());
                            struct.setActionIsSet(true);
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

        public void write(org.apache.thrift.protocol.TProtocol oprot, JobInstanceUpdateEvent struct) throws org.apache.thrift.TException {
            struct.validate();

            oprot.writeStructBegin(STRUCT_DESC);
            oprot.writeFieldBegin(INSTANCE_ID_FIELD_DESC);
            oprot.writeI32(struct.instanceId);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(TIMESTAMP_MS_FIELD_DESC);
            oprot.writeI64(struct.timestampMs);
            oprot.writeFieldEnd();
            if (struct.action != null) {
                oprot.writeFieldBegin(ACTION_FIELD_DESC);
                oprot.writeI32(struct.action.getValue());
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }

    }

    private static class JobInstanceUpdateEventTupleSchemeFactory implements SchemeFactory {
        public JobInstanceUpdateEventTupleScheme getScheme() {
            return new JobInstanceUpdateEventTupleScheme();
        }
    }

    private static class JobInstanceUpdateEventTupleScheme extends TupleScheme<JobInstanceUpdateEvent> {

        @Override
        public void write(org.apache.thrift.protocol.TProtocol prot, JobInstanceUpdateEvent struct) throws org.apache.thrift.TException {
            TTupleProtocol oprot = (TTupleProtocol) prot;
            BitSet optionals = new BitSet();
            if (struct.isSetInstanceId()) {
                optionals.set(0);
            }
            if (struct.isSetTimestampMs()) {
                optionals.set(1);
            }
            if (struct.isSetAction()) {
                optionals.set(2);
            }
            oprot.writeBitSet(optionals, 3);
            if (struct.isSetInstanceId()) {
                oprot.writeI32(struct.instanceId);
            }
            if (struct.isSetTimestampMs()) {
                oprot.writeI64(struct.timestampMs);
            }
            if (struct.isSetAction()) {
                oprot.writeI32(struct.action.getValue());
            }
        }

        @Override
        public void read(org.apache.thrift.protocol.TProtocol prot, JobInstanceUpdateEvent struct) throws org.apache.thrift.TException {
            TTupleProtocol iprot = (TTupleProtocol) prot;
            BitSet incoming = iprot.readBitSet(3);
            if (incoming.get(0)) {
                struct.instanceId = iprot.readI32();
                struct.setInstanceIdIsSet(true);
            }
            if (incoming.get(1)) {
                struct.timestampMs = iprot.readI64();
                struct.setTimestampMsIsSet(true);
            }
            if (incoming.get(2)) {
                struct.action = com.milestone1.aurora.client.sdk.JobUpdateAction.findByValue(iprot.readI32());
                struct.setActionIsSet(true);
            }
        }
    }

}

