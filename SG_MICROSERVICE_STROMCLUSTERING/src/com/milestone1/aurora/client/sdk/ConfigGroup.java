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
public class ConfigGroup implements org.apache.thrift.TBase<ConfigGroup, ConfigGroup._Fields>, java.io.Serializable, Cloneable, Comparable<ConfigGroup> {
    // isset id assignments
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ConfigGroup");
    private static final org.apache.thrift.protocol.TField CONFIG_FIELD_DESC = new org.apache.thrift.protocol.TField("config", org.apache.thrift.protocol.TType.STRUCT, (short) 1);
    private static final org.apache.thrift.protocol.TField INSTANCES_FIELD_DESC = new org.apache.thrift.protocol.TField("instances", org.apache.thrift.protocol.TType.SET, (short) 3);
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();

    static {
        schemes.put(StandardScheme.class, new ConfigGroupStandardSchemeFactory());
        schemes.put(TupleScheme.class, new ConfigGroupTupleSchemeFactory());
    }

    static {
        Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
        tmpMap.put(_Fields.CONFIG, new org.apache.thrift.meta_data.FieldMetaData("config", org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TaskConfig.class)));
        tmpMap.put(_Fields.INSTANCES, new org.apache.thrift.meta_data.FieldMetaData("instances", org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET,
                        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Range.class))));
        metaDataMap = Collections.unmodifiableMap(tmpMap);
        org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ConfigGroup.class, metaDataMap);
    }

    public TaskConfig config; // required
    public Set<Range> instances; // required

    public ConfigGroup() {
    }

    public ConfigGroup(
            TaskConfig config,
            Set<Range> instances) {
        this();
        this.config = config;
        this.instances = instances;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public ConfigGroup(ConfigGroup other) {
        if (other.isSetConfig()) {
            this.config = new TaskConfig(other.config);
        }
        if (other.isSetInstances()) {
            Set<Range> __this__instances = new HashSet<Range>(other.instances.size());
            for (Range other_element : other.instances) {
                __this__instances.add(new Range(other_element));
            }
            this.instances = __this__instances;
        }
    }

    public ConfigGroup deepCopy() {
        return new ConfigGroup(this);
    }

    @Override
    public void clear() {
        this.config = null;
        this.instances = null;
    }

    public TaskConfig getConfig() {
        return this.config;
    }

    public ConfigGroup setConfig(TaskConfig config) {
        this.config = config;
        return this;
    }

    public void unsetConfig() {
        this.config = null;
    }

    /**
     * Returns true if field config is set (has been assigned a value) and false otherwise
     */
    public boolean isSetConfig() {
        return this.config != null;
    }

    public void setConfigIsSet(boolean value) {
        if (!value) {
            this.config = null;
        }
    }

    public int getInstancesSize() {
        return (this.instances == null) ? 0 : this.instances.size();
    }

    public java.util.Iterator<Range> getInstancesIterator() {
        return (this.instances == null) ? null : this.instances.iterator();
    }

    public void addToInstances(Range elem) {
        if (this.instances == null) {
            this.instances = new HashSet<Range>();
        }
        this.instances.add(elem);
    }

    public Set<Range> getInstances() {
        return this.instances;
    }

    public ConfigGroup setInstances(Set<Range> instances) {
        this.instances = instances;
        return this;
    }

    public void unsetInstances() {
        this.instances = null;
    }

    /**
     * Returns true if field instances is set (has been assigned a value) and false otherwise
     */
    public boolean isSetInstances() {
        return this.instances != null;
    }

    public void setInstancesIsSet(boolean value) {
        if (!value) {
            this.instances = null;
        }
    }

    public void setFieldValue(_Fields field, Object value) {
        switch (field) {
            case CONFIG:
                if (value == null) {
                    unsetConfig();
                } else {
                    setConfig((TaskConfig) value);
                }
                break;

            case INSTANCES:
                if (value == null) {
                    unsetInstances();
                } else {
                    setInstances((Set<Range>) value);
                }
                break;

        }
    }

    public Object getFieldValue(_Fields field) {
        switch (field) {
            case CONFIG:
                return getConfig();

            case INSTANCES:
                return getInstances();

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
            case CONFIG:
                return isSetConfig();
            case INSTANCES:
                return isSetInstances();
        }
        throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
        if (that == null)
            return false;
        if (that instanceof ConfigGroup)
            return this.equals((ConfigGroup) that);
        return false;
    }

    public boolean equals(ConfigGroup that) {
        if (that == null)
            return false;

        boolean this_present_config = true && this.isSetConfig();
        boolean that_present_config = true && that.isSetConfig();
        if (this_present_config || that_present_config) {
            if (!(this_present_config && that_present_config))
                return false;
            if (!this.config.equals(that.config))
                return false;
        }

        boolean this_present_instances = true && this.isSetInstances();
        boolean that_present_instances = true && that.isSetInstances();
        if (this_present_instances || that_present_instances) {
            if (!(this_present_instances && that_present_instances))
                return false;
            if (!this.instances.equals(that.instances))
                return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        List<Object> list = new ArrayList<Object>();

        boolean present_config = true && (isSetConfig());
        list.add(present_config);
        if (present_config)
            list.add(config);

        boolean present_instances = true && (isSetInstances());
        list.add(present_instances);
        if (present_instances)
            list.add(instances);

        return list.hashCode();
    }

    @Override
    public int compareTo(ConfigGroup other) {
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }

        int lastComparison = 0;

        lastComparison = Boolean.valueOf(isSetConfig()).compareTo(other.isSetConfig());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetConfig()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.config, other.config);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetInstances()).compareTo(other.isSetInstances());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetInstances()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.instances, other.instances);
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
        StringBuilder sb = new StringBuilder("ConfigGroup(");
        boolean first = true;

        sb.append("config:");
        if (this.config == null) {
            sb.append("null");
        } else {
            sb.append(this.config);
        }
        first = false;
        if (!first) sb.append(", ");
        sb.append("instances:");
        if (this.instances == null) {
            sb.append("null");
        } else {
            sb.append(this.instances);
        }
        first = false;
        sb.append(")");
        return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
        // check for required fields
        // check for sub-struct validity
        if (config != null) {
            config.validate();
        }
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
        CONFIG((short) 1, "config"),
        INSTANCES((short) 3, "instances");

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
                case 1: // CONFIG
                    return CONFIG;
                case 3: // INSTANCES
                    return INSTANCES;
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

    private static class ConfigGroupStandardSchemeFactory implements SchemeFactory {
        public ConfigGroupStandardScheme getScheme() {
            return new ConfigGroupStandardScheme();
        }
    }

    private static class ConfigGroupStandardScheme extends StandardScheme<ConfigGroup> {

        public void read(org.apache.thrift.protocol.TProtocol iprot, ConfigGroup struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();
            while (true) {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                    break;
                }
                switch (schemeField.id) {
                    case 1: // CONFIG
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
                            struct.config = new TaskConfig();
                            struct.config.read(iprot);
                            struct.setConfigIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 3: // INSTANCES
                        if (schemeField.type == org.apache.thrift.protocol.TType.SET) {
                            {
                                org.apache.thrift.protocol.TSet _set100 = iprot.readSetBegin();
                                struct.instances = new HashSet<Range>(2 * _set100.size);
                                Range _elem101;
                                for (int _i102 = 0; _i102 < _set100.size; ++_i102) {
                                    _elem101 = new Range();
                                    _elem101.read(iprot);
                                    struct.instances.add(_elem101);
                                }
                                iprot.readSetEnd();
                            }
                            struct.setInstancesIsSet(true);
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

        public void write(org.apache.thrift.protocol.TProtocol oprot, ConfigGroup struct) throws org.apache.thrift.TException {
            struct.validate();

            oprot.writeStructBegin(STRUCT_DESC);
            if (struct.config != null) {
                oprot.writeFieldBegin(CONFIG_FIELD_DESC);
                struct.config.write(oprot);
                oprot.writeFieldEnd();
            }
            if (struct.instances != null) {
                oprot.writeFieldBegin(INSTANCES_FIELD_DESC);
                {
                    oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, struct.instances.size()));
                    for (Range _iter103 : struct.instances) {
                        _iter103.write(oprot);
                    }
                    oprot.writeSetEnd();
                }
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }

    }

    private static class ConfigGroupTupleSchemeFactory implements SchemeFactory {
        public ConfigGroupTupleScheme getScheme() {
            return new ConfigGroupTupleScheme();
        }
    }

    private static class ConfigGroupTupleScheme extends TupleScheme<ConfigGroup> {

        @Override
        public void write(org.apache.thrift.protocol.TProtocol prot, ConfigGroup struct) throws org.apache.thrift.TException {
            TTupleProtocol oprot = (TTupleProtocol) prot;
            BitSet optionals = new BitSet();
            if (struct.isSetConfig()) {
                optionals.set(0);
            }
            if (struct.isSetInstances()) {
                optionals.set(1);
            }
            oprot.writeBitSet(optionals, 2);
            if (struct.isSetConfig()) {
                struct.config.write(oprot);
            }
            if (struct.isSetInstances()) {
                {
                    oprot.writeI32(struct.instances.size());
                    for (Range _iter104 : struct.instances) {
                        _iter104.write(oprot);
                    }
                }
            }
        }

        @Override
        public void read(org.apache.thrift.protocol.TProtocol prot, ConfigGroup struct) throws org.apache.thrift.TException {
            TTupleProtocol iprot = (TTupleProtocol) prot;
            BitSet incoming = iprot.readBitSet(2);
            if (incoming.get(0)) {
                struct.config = new TaskConfig();
                struct.config.read(iprot);
                struct.setConfigIsSet(true);
            }
            if (incoming.get(1)) {
                {
                    org.apache.thrift.protocol.TSet _set105 = new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
                    struct.instances = new HashSet<Range>(2 * _set105.size);
                    Range _elem106;
                    for (int _i107 = 0; _i107 < _set105.size; ++_i107) {
                        _elem106 = new Range();
                        _elem106.read(iprot);
                        struct.instances.add(_elem106);
                    }
                }
                struct.setInstancesIsSet(true);
            }
        }
    }

}

