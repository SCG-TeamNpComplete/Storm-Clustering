/**
 * Autogenerated by Thrift Compiler (0.9.3)
 * <p>
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *
 * @generated
 */
package com.milestone1.aurora.client.sdk;

import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;

import javax.annotation.Generated;
import java.util.*;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-12-08")
public class GetPendingReasonResult implements org.apache.thrift.TBase<GetPendingReasonResult, GetPendingReasonResult._Fields>, java.io.Serializable, Cloneable, Comparable<GetPendingReasonResult> {
    // isset id assignments
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetPendingReasonResult");
    private static final org.apache.thrift.protocol.TField REASONS_FIELD_DESC = new org.apache.thrift.protocol.TField("reasons", org.apache.thrift.protocol.TType.SET, (short) 1);
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();

    static {
        schemes.put(StandardScheme.class, new GetPendingReasonResultStandardSchemeFactory());
        schemes.put(TupleScheme.class, new GetPendingReasonResultTupleSchemeFactory());
    }

    static {
        Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
        tmpMap.put(_Fields.REASONS, new org.apache.thrift.meta_data.FieldMetaData("reasons", org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET,
                        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PendingReason.class))));
        metaDataMap = Collections.unmodifiableMap(tmpMap);
        org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetPendingReasonResult.class, metaDataMap);
    }

    public Set<PendingReason> reasons; // required

    public GetPendingReasonResult() {
    }

    public GetPendingReasonResult(
            Set<PendingReason> reasons) {
        this();
        this.reasons = reasons;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public GetPendingReasonResult(GetPendingReasonResult other) {
        if (other.isSetReasons()) {
            Set<PendingReason> __this__reasons = new HashSet<PendingReason>(other.reasons.size());
            for (PendingReason other_element : other.reasons) {
                __this__reasons.add(new PendingReason(other_element));
            }
            this.reasons = __this__reasons;
        }
    }

    public GetPendingReasonResult deepCopy() {
        return new GetPendingReasonResult(this);
    }

    @Override
    public void clear() {
        this.reasons = null;
    }

    public int getReasonsSize() {
        return (this.reasons == null) ? 0 : this.reasons.size();
    }

    public java.util.Iterator<PendingReason> getReasonsIterator() {
        return (this.reasons == null) ? null : this.reasons.iterator();
    }

    public void addToReasons(PendingReason elem) {
        if (this.reasons == null) {
            this.reasons = new HashSet<PendingReason>();
        }
        this.reasons.add(elem);
    }

    public Set<PendingReason> getReasons() {
        return this.reasons;
    }

    public GetPendingReasonResult setReasons(Set<PendingReason> reasons) {
        this.reasons = reasons;
        return this;
    }

    public void unsetReasons() {
        this.reasons = null;
    }

    /**
     * Returns true if field reasons is set (has been assigned a value) and false otherwise
     */
    public boolean isSetReasons() {
        return this.reasons != null;
    }

    public void setReasonsIsSet(boolean value) {
        if (!value) {
            this.reasons = null;
        }
    }

    public void setFieldValue(_Fields field, Object value) {
        switch (field) {
            case REASONS:
                if (value == null) {
                    unsetReasons();
                } else {
                    setReasons((Set<PendingReason>) value);
                }
                break;

        }
    }

    public Object getFieldValue(_Fields field) {
        switch (field) {
            case REASONS:
                return getReasons();

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
            case REASONS:
                return isSetReasons();
        }
        throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
        if (that == null)
            return false;
        if (that instanceof GetPendingReasonResult)
            return this.equals((GetPendingReasonResult) that);
        return false;
    }

    public boolean equals(GetPendingReasonResult that) {
        if (that == null)
            return false;

        boolean this_present_reasons = true && this.isSetReasons();
        boolean that_present_reasons = true && that.isSetReasons();
        if (this_present_reasons || that_present_reasons) {
            if (!(this_present_reasons && that_present_reasons))
                return false;
            if (!this.reasons.equals(that.reasons))
                return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        List<Object> list = new ArrayList<Object>();

        boolean present_reasons = true && (isSetReasons());
        list.add(present_reasons);
        if (present_reasons)
            list.add(reasons);

        return list.hashCode();
    }

    @Override
    public int compareTo(GetPendingReasonResult other) {
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }

        int lastComparison = 0;

        lastComparison = Boolean.valueOf(isSetReasons()).compareTo(other.isSetReasons());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetReasons()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.reasons, other.reasons);
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
        StringBuilder sb = new StringBuilder("GetPendingReasonResult(");
        boolean first = true;

        sb.append("reasons:");
        if (this.reasons == null) {
            sb.append("null");
        } else {
            sb.append(this.reasons);
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
        REASONS((short) 1, "reasons");

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
                case 1: // REASONS
                    return REASONS;
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

    private static class GetPendingReasonResultStandardSchemeFactory implements SchemeFactory {
        public GetPendingReasonResultStandardScheme getScheme() {
            return new GetPendingReasonResultStandardScheme();
        }
    }

    private static class GetPendingReasonResultStandardScheme extends StandardScheme<GetPendingReasonResult> {

        public void read(org.apache.thrift.protocol.TProtocol iprot, GetPendingReasonResult struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();
            while (true) {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                    break;
                }
                switch (schemeField.id) {
                    case 1: // REASONS
                        if (schemeField.type == org.apache.thrift.protocol.TType.SET) {
                            {
                                org.apache.thrift.protocol.TSet _set326 = iprot.readSetBegin();
                                struct.reasons = new HashSet<PendingReason>(2 * _set326.size);
                                PendingReason _elem327;
                                for (int _i328 = 0; _i328 < _set326.size; ++_i328) {
                                    _elem327 = new PendingReason();
                                    _elem327.read(iprot);
                                    struct.reasons.add(_elem327);
                                }
                                iprot.readSetEnd();
                            }
                            struct.setReasonsIsSet(true);
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

        public void write(org.apache.thrift.protocol.TProtocol oprot, GetPendingReasonResult struct) throws org.apache.thrift.TException {
            struct.validate();

            oprot.writeStructBegin(STRUCT_DESC);
            if (struct.reasons != null) {
                oprot.writeFieldBegin(REASONS_FIELD_DESC);
                {
                    oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, struct.reasons.size()));
                    for (PendingReason _iter329 : struct.reasons) {
                        _iter329.write(oprot);
                    }
                    oprot.writeSetEnd();
                }
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }

    }

    private static class GetPendingReasonResultTupleSchemeFactory implements SchemeFactory {
        public GetPendingReasonResultTupleScheme getScheme() {
            return new GetPendingReasonResultTupleScheme();
        }
    }

    private static class GetPendingReasonResultTupleScheme extends TupleScheme<GetPendingReasonResult> {

        @Override
        public void write(org.apache.thrift.protocol.TProtocol prot, GetPendingReasonResult struct) throws org.apache.thrift.TException {
            TTupleProtocol oprot = (TTupleProtocol) prot;
            BitSet optionals = new BitSet();
            if (struct.isSetReasons()) {
                optionals.set(0);
            }
            oprot.writeBitSet(optionals, 1);
            if (struct.isSetReasons()) {
                {
                    oprot.writeI32(struct.reasons.size());
                    for (PendingReason _iter330 : struct.reasons) {
                        _iter330.write(oprot);
                    }
                }
            }
        }

        @Override
        public void read(org.apache.thrift.protocol.TProtocol prot, GetPendingReasonResult struct) throws org.apache.thrift.TException {
            TTupleProtocol iprot = (TTupleProtocol) prot;
            BitSet incoming = iprot.readBitSet(1);
            if (incoming.get(0)) {
                {
                    org.apache.thrift.protocol.TSet _set331 = new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
                    struct.reasons = new HashSet<PendingReason>(2 * _set331.size);
                    PendingReason _elem332;
                    for (int _i333 = 0; _i333 < _set331.size; ++_i333) {
                        _elem332 = new PendingReason();
                        _elem332.read(iprot);
                        struct.reasons.add(_elem332);
                    }
                }
                struct.setReasonsIsSet(true);
            }
        }
    }

}

