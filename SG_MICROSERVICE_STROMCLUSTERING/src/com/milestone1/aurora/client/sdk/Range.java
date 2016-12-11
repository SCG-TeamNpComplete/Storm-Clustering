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
 * Closed range of integers.
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-12-08")
public class Range implements org.apache.thrift.TBase<Range, Range._Fields>, java.io.Serializable, Cloneable, Comparable<Range> {
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Range");
    private static final org.apache.thrift.protocol.TField FIRST_FIELD_DESC = new org.apache.thrift.protocol.TField("first", org.apache.thrift.protocol.TType.I32, (short) 1);
    private static final org.apache.thrift.protocol.TField LAST_FIELD_DESC = new org.apache.thrift.protocol.TField("last", org.apache.thrift.protocol.TType.I32, (short) 2);
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    // isset id assignments
    private static final int __FIRST_ISSET_ID = 0;
    private static final int __LAST_ISSET_ID = 1;

    static {
        schemes.put(StandardScheme.class, new RangeStandardSchemeFactory());
        schemes.put(TupleScheme.class, new RangeTupleSchemeFactory());
    }

    static {
        Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
        tmpMap.put(_Fields.FIRST, new org.apache.thrift.meta_data.FieldMetaData("first", org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
        tmpMap.put(_Fields.LAST, new org.apache.thrift.meta_data.FieldMetaData("last", org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
        metaDataMap = Collections.unmodifiableMap(tmpMap);
        org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Range.class, metaDataMap);
    }

    public int first; // required
    public int last; // required
    private byte __isset_bitfield = 0;

    public Range() {
    }

    public Range(
            int first,
            int last) {
        this();
        this.first = first;
        setFirstIsSet(true);
        this.last = last;
        setLastIsSet(true);
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public Range(Range other) {
        __isset_bitfield = other.__isset_bitfield;
        this.first = other.first;
        this.last = other.last;
    }

    public Range deepCopy() {
        return new Range(this);
    }

    @Override
    public void clear() {
        setFirstIsSet(false);
        this.first = 0;
        setLastIsSet(false);
        this.last = 0;
    }

    public int getFirst() {
        return this.first;
    }

    public Range setFirst(int first) {
        this.first = first;
        setFirstIsSet(true);
        return this;
    }

    public void unsetFirst() {
        __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __FIRST_ISSET_ID);
    }

    /**
     * Returns true if field first is set (has been assigned a value) and false otherwise
     */
    public boolean isSetFirst() {
        return EncodingUtils.testBit(__isset_bitfield, __FIRST_ISSET_ID);
    }

    public void setFirstIsSet(boolean value) {
        __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __FIRST_ISSET_ID, value);
    }

    public int getLast() {
        return this.last;
    }

    public Range setLast(int last) {
        this.last = last;
        setLastIsSet(true);
        return this;
    }

    public void unsetLast() {
        __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LAST_ISSET_ID);
    }

    /**
     * Returns true if field last is set (has been assigned a value) and false otherwise
     */
    public boolean isSetLast() {
        return EncodingUtils.testBit(__isset_bitfield, __LAST_ISSET_ID);
    }

    public void setLastIsSet(boolean value) {
        __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LAST_ISSET_ID, value);
    }

    public void setFieldValue(_Fields field, Object value) {
        switch (field) {
            case FIRST:
                if (value == null) {
                    unsetFirst();
                } else {
                    setFirst((Integer) value);
                }
                break;

            case LAST:
                if (value == null) {
                    unsetLast();
                } else {
                    setLast((Integer) value);
                }
                break;

        }
    }

    public Object getFieldValue(_Fields field) {
        switch (field) {
            case FIRST:
                return getFirst();

            case LAST:
                return getLast();

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
            case FIRST:
                return isSetFirst();
            case LAST:
                return isSetLast();
        }
        throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
        if (that == null)
            return false;
        if (that instanceof Range)
            return this.equals((Range) that);
        return false;
    }

    public boolean equals(Range that) {
        if (that == null)
            return false;

        boolean this_present_first = true;
        boolean that_present_first = true;
        if (this_present_first || that_present_first) {
            if (!(this_present_first && that_present_first))
                return false;
            if (this.first != that.first)
                return false;
        }

        boolean this_present_last = true;
        boolean that_present_last = true;
        if (this_present_last || that_present_last) {
            if (!(this_present_last && that_present_last))
                return false;
            if (this.last != that.last)
                return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        List<Object> list = new ArrayList<Object>();

        boolean present_first = true;
        list.add(present_first);
        if (present_first)
            list.add(first);

        boolean present_last = true;
        list.add(present_last);
        if (present_last)
            list.add(last);

        return list.hashCode();
    }

    @Override
    public int compareTo(Range other) {
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }

        int lastComparison = 0;

        lastComparison = Boolean.valueOf(isSetFirst()).compareTo(other.isSetFirst());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetFirst()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.first, other.first);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetLast()).compareTo(other.isSetLast());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetLast()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.last, other.last);
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
        StringBuilder sb = new StringBuilder("Range(");
        boolean first = true;

        sb.append("first:");
        sb.append(this.first);
        first = false;
        if (!first) sb.append(", ");
        sb.append("last:");
        sb.append(this.last);
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
        FIRST((short) 1, "first"),
        LAST((short) 2, "last");

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
                case 1: // FIRST
                    return FIRST;
                case 2: // LAST
                    return LAST;
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

    private static class RangeStandardSchemeFactory implements SchemeFactory {
        public RangeStandardScheme getScheme() {
            return new RangeStandardScheme();
        }
    }

    private static class RangeStandardScheme extends StandardScheme<Range> {

        public void read(org.apache.thrift.protocol.TProtocol iprot, Range struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();
            while (true) {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                    break;
                }
                switch (schemeField.id) {
                    case 1: // FIRST
                        if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
                            struct.first = iprot.readI32();
                            struct.setFirstIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 2: // LAST
                        if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
                            struct.last = iprot.readI32();
                            struct.setLastIsSet(true);
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

        public void write(org.apache.thrift.protocol.TProtocol oprot, Range struct) throws org.apache.thrift.TException {
            struct.validate();

            oprot.writeStructBegin(STRUCT_DESC);
            oprot.writeFieldBegin(FIRST_FIELD_DESC);
            oprot.writeI32(struct.first);
            oprot.writeFieldEnd();
            oprot.writeFieldBegin(LAST_FIELD_DESC);
            oprot.writeI32(struct.last);
            oprot.writeFieldEnd();
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }

    }

    private static class RangeTupleSchemeFactory implements SchemeFactory {
        public RangeTupleScheme getScheme() {
            return new RangeTupleScheme();
        }
    }

    private static class RangeTupleScheme extends TupleScheme<Range> {

        @Override
        public void write(org.apache.thrift.protocol.TProtocol prot, Range struct) throws org.apache.thrift.TException {
            TTupleProtocol oprot = (TTupleProtocol) prot;
            BitSet optionals = new BitSet();
            if (struct.isSetFirst()) {
                optionals.set(0);
            }
            if (struct.isSetLast()) {
                optionals.set(1);
            }
            oprot.writeBitSet(optionals, 2);
            if (struct.isSetFirst()) {
                oprot.writeI32(struct.first);
            }
            if (struct.isSetLast()) {
                oprot.writeI32(struct.last);
            }
        }

        @Override
        public void read(org.apache.thrift.protocol.TProtocol prot, Range struct) throws org.apache.thrift.TException {
            TTupleProtocol iprot = (TTupleProtocol) prot;
            BitSet incoming = iprot.readBitSet(2);
            if (incoming.get(0)) {
                struct.first = iprot.readI32();
                struct.setFirstIsSet(true);
            }
            if (incoming.get(1)) {
                struct.last = iprot.readI32();
                struct.setLastIsSet(true);
            }
        }
    }

}

