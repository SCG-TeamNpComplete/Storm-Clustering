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
 * URI which mirrors CommandInfo.URI in the Mesos Protobuf
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-12-08")
public class MesosFetcherURI implements org.apache.thrift.TBase<MesosFetcherURI, MesosFetcherURI._Fields>, java.io.Serializable, Cloneable, Comparable<MesosFetcherURI> {
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MesosFetcherURI");
    private static final org.apache.thrift.protocol.TField VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("value", org.apache.thrift.protocol.TType.STRING, (short) 1);
    private static final org.apache.thrift.protocol.TField EXTRACT_FIELD_DESC = new org.apache.thrift.protocol.TField("extract", org.apache.thrift.protocol.TType.BOOL, (short) 2);
    private static final org.apache.thrift.protocol.TField CACHE_FIELD_DESC = new org.apache.thrift.protocol.TField("cache", org.apache.thrift.protocol.TType.BOOL, (short) 3);
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    // isset id assignments
    private static final int __EXTRACT_ISSET_ID = 0;
    private static final int __CACHE_ISSET_ID = 1;
    private static final _Fields optionals[] = {_Fields.EXTRACT, _Fields.CACHE};

    static {
        schemes.put(StandardScheme.class, new MesosFetcherURIStandardSchemeFactory());
        schemes.put(TupleScheme.class, new MesosFetcherURITupleSchemeFactory());
    }

    static {
        Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
        tmpMap.put(_Fields.VALUE, new org.apache.thrift.meta_data.FieldMetaData("value", org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        tmpMap.put(_Fields.EXTRACT, new org.apache.thrift.meta_data.FieldMetaData("extract", org.apache.thrift.TFieldRequirementType.OPTIONAL,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
        tmpMap.put(_Fields.CACHE, new org.apache.thrift.meta_data.FieldMetaData("cache", org.apache.thrift.TFieldRequirementType.OPTIONAL,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
        metaDataMap = Collections.unmodifiableMap(tmpMap);
        org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MesosFetcherURI.class, metaDataMap);
    }

    /**
     * Where to get the resource from
     */
    public String value; // required
    /**
     * Extract compressed archive after downloading
     */
    public boolean extract; // optional
    /**
     * Cache value using Mesos Fetcher caching mechanism *
     */
    public boolean cache; // optional
    private byte __isset_bitfield = 0;

    public MesosFetcherURI() {
    }

    public MesosFetcherURI(
            String value) {
        this();
        this.value = value;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public MesosFetcherURI(MesosFetcherURI other) {
        __isset_bitfield = other.__isset_bitfield;
        if (other.isSetValue()) {
            this.value = other.value;
        }
        this.extract = other.extract;
        this.cache = other.cache;
    }

    public MesosFetcherURI deepCopy() {
        return new MesosFetcherURI(this);
    }

    @Override
    public void clear() {
        this.value = null;
        setExtractIsSet(false);
        this.extract = false;
        setCacheIsSet(false);
        this.cache = false;
    }

    /**
     * Where to get the resource from
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Where to get the resource from
     */
    public MesosFetcherURI setValue(String value) {
        this.value = value;
        return this;
    }

    public void unsetValue() {
        this.value = null;
    }

    /**
     * Returns true if field value is set (has been assigned a value) and false otherwise
     */
    public boolean isSetValue() {
        return this.value != null;
    }

    public void setValueIsSet(boolean value) {
        if (!value) {
            this.value = null;
        }
    }

    /**
     * Extract compressed archive after downloading
     */
    public boolean isExtract() {
        return this.extract;
    }

    /**
     * Extract compressed archive after downloading
     */
    public MesosFetcherURI setExtract(boolean extract) {
        this.extract = extract;
        setExtractIsSet(true);
        return this;
    }

    public void unsetExtract() {
        __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __EXTRACT_ISSET_ID);
    }

    /**
     * Returns true if field extract is set (has been assigned a value) and false otherwise
     */
    public boolean isSetExtract() {
        return EncodingUtils.testBit(__isset_bitfield, __EXTRACT_ISSET_ID);
    }

    public void setExtractIsSet(boolean value) {
        __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __EXTRACT_ISSET_ID, value);
    }

    /**
     * Cache value using Mesos Fetcher caching mechanism *
     */
    public boolean isCache() {
        return this.cache;
    }

    /**
     * Cache value using Mesos Fetcher caching mechanism *
     */
    public MesosFetcherURI setCache(boolean cache) {
        this.cache = cache;
        setCacheIsSet(true);
        return this;
    }

    public void unsetCache() {
        __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CACHE_ISSET_ID);
    }

    /**
     * Returns true if field cache is set (has been assigned a value) and false otherwise
     */
    public boolean isSetCache() {
        return EncodingUtils.testBit(__isset_bitfield, __CACHE_ISSET_ID);
    }

    public void setCacheIsSet(boolean value) {
        __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CACHE_ISSET_ID, value);
    }

    public void setFieldValue(_Fields field, Object value) {
        switch (field) {
            case VALUE:
                if (value == null) {
                    unsetValue();
                } else {
                    setValue((String) value);
                }
                break;

            case EXTRACT:
                if (value == null) {
                    unsetExtract();
                } else {
                    setExtract((Boolean) value);
                }
                break;

            case CACHE:
                if (value == null) {
                    unsetCache();
                } else {
                    setCache((Boolean) value);
                }
                break;

        }
    }

    public Object getFieldValue(_Fields field) {
        switch (field) {
            case VALUE:
                return getValue();

            case EXTRACT:
                return isExtract();

            case CACHE:
                return isCache();

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
            case VALUE:
                return isSetValue();
            case EXTRACT:
                return isSetExtract();
            case CACHE:
                return isSetCache();
        }
        throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
        if (that == null)
            return false;
        if (that instanceof MesosFetcherURI)
            return this.equals((MesosFetcherURI) that);
        return false;
    }

    public boolean equals(MesosFetcherURI that) {
        if (that == null)
            return false;

        boolean this_present_value = true && this.isSetValue();
        boolean that_present_value = true && that.isSetValue();
        if (this_present_value || that_present_value) {
            if (!(this_present_value && that_present_value))
                return false;
            if (!this.value.equals(that.value))
                return false;
        }

        boolean this_present_extract = true && this.isSetExtract();
        boolean that_present_extract = true && that.isSetExtract();
        if (this_present_extract || that_present_extract) {
            if (!(this_present_extract && that_present_extract))
                return false;
            if (this.extract != that.extract)
                return false;
        }

        boolean this_present_cache = true && this.isSetCache();
        boolean that_present_cache = true && that.isSetCache();
        if (this_present_cache || that_present_cache) {
            if (!(this_present_cache && that_present_cache))
                return false;
            if (this.cache != that.cache)
                return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        List<Object> list = new ArrayList<Object>();

        boolean present_value = true && (isSetValue());
        list.add(present_value);
        if (present_value)
            list.add(value);

        boolean present_extract = true && (isSetExtract());
        list.add(present_extract);
        if (present_extract)
            list.add(extract);

        boolean present_cache = true && (isSetCache());
        list.add(present_cache);
        if (present_cache)
            list.add(cache);

        return list.hashCode();
    }

    @Override
    public int compareTo(MesosFetcherURI other) {
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }

        int lastComparison = 0;

        lastComparison = Boolean.valueOf(isSetValue()).compareTo(other.isSetValue());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetValue()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.value, other.value);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetExtract()).compareTo(other.isSetExtract());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetExtract()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.extract, other.extract);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetCache()).compareTo(other.isSetCache());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetCache()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cache, other.cache);
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
        StringBuilder sb = new StringBuilder("MesosFetcherURI(");
        boolean first = true;

        sb.append("value:");
        if (this.value == null) {
            sb.append("null");
        } else {
            sb.append(this.value);
        }
        first = false;
        if (isSetExtract()) {
            if (!first) sb.append(", ");
            sb.append("extract:");
            sb.append(this.extract);
            first = false;
        }
        if (isSetCache()) {
            if (!first) sb.append(", ");
            sb.append("cache:");
            sb.append(this.cache);
            first = false;
        }
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
         * Where to get the resource from
         */
        VALUE((short) 1, "value"),
        /**
         * Extract compressed archive after downloading
         */
        EXTRACT((short) 2, "extract"),
        /**
         * Cache value using Mesos Fetcher caching mechanism *
         */
        CACHE((short) 3, "cache");

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
                case 1: // VALUE
                    return VALUE;
                case 2: // EXTRACT
                    return EXTRACT;
                case 3: // CACHE
                    return CACHE;
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

    private static class MesosFetcherURIStandardSchemeFactory implements SchemeFactory {
        public MesosFetcherURIStandardScheme getScheme() {
            return new MesosFetcherURIStandardScheme();
        }
    }

    private static class MesosFetcherURIStandardScheme extends StandardScheme<MesosFetcherURI> {

        public void read(org.apache.thrift.protocol.TProtocol iprot, MesosFetcherURI struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();
            while (true) {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                    break;
                }
                switch (schemeField.id) {
                    case 1: // VALUE
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.value = iprot.readString();
                            struct.setValueIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 2: // EXTRACT
                        if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
                            struct.extract = iprot.readBool();
                            struct.setExtractIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 3: // CACHE
                        if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
                            struct.cache = iprot.readBool();
                            struct.setCacheIsSet(true);
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

        public void write(org.apache.thrift.protocol.TProtocol oprot, MesosFetcherURI struct) throws org.apache.thrift.TException {
            struct.validate();

            oprot.writeStructBegin(STRUCT_DESC);
            if (struct.value != null) {
                oprot.writeFieldBegin(VALUE_FIELD_DESC);
                oprot.writeString(struct.value);
                oprot.writeFieldEnd();
            }
            if (struct.isSetExtract()) {
                oprot.writeFieldBegin(EXTRACT_FIELD_DESC);
                oprot.writeBool(struct.extract);
                oprot.writeFieldEnd();
            }
            if (struct.isSetCache()) {
                oprot.writeFieldBegin(CACHE_FIELD_DESC);
                oprot.writeBool(struct.cache);
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }

    }

    private static class MesosFetcherURITupleSchemeFactory implements SchemeFactory {
        public MesosFetcherURITupleScheme getScheme() {
            return new MesosFetcherURITupleScheme();
        }
    }

    private static class MesosFetcherURITupleScheme extends TupleScheme<MesosFetcherURI> {

        @Override
        public void write(org.apache.thrift.protocol.TProtocol prot, MesosFetcherURI struct) throws org.apache.thrift.TException {
            TTupleProtocol oprot = (TTupleProtocol) prot;
            BitSet optionals = new BitSet();
            if (struct.isSetValue()) {
                optionals.set(0);
            }
            if (struct.isSetExtract()) {
                optionals.set(1);
            }
            if (struct.isSetCache()) {
                optionals.set(2);
            }
            oprot.writeBitSet(optionals, 3);
            if (struct.isSetValue()) {
                oprot.writeString(struct.value);
            }
            if (struct.isSetExtract()) {
                oprot.writeBool(struct.extract);
            }
            if (struct.isSetCache()) {
                oprot.writeBool(struct.cache);
            }
        }

        @Override
        public void read(org.apache.thrift.protocol.TProtocol prot, MesosFetcherURI struct) throws org.apache.thrift.TException {
            TTupleProtocol iprot = (TTupleProtocol) prot;
            BitSet incoming = iprot.readBitSet(3);
            if (incoming.get(0)) {
                struct.value = iprot.readString();
                struct.setValueIsSet(true);
            }
            if (incoming.get(1)) {
                struct.extract = iprot.readBool();
                struct.setExtractIsSet(true);
            }
            if (incoming.get(2)) {
                struct.cache = iprot.readBool();
                struct.setCacheIsSet(true);
            }
        }
    }

}

