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
public class QueryRecoveryResult implements org.apache.thrift.TBase<QueryRecoveryResult, QueryRecoveryResult._Fields>, java.io.Serializable, Cloneable, Comparable<QueryRecoveryResult> {
    // isset id assignments
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("QueryRecoveryResult");
    private static final org.apache.thrift.protocol.TField TASKS_FIELD_DESC = new org.apache.thrift.protocol.TField("tasks", org.apache.thrift.protocol.TType.SET, (short) 1);
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();

    static {
        schemes.put(StandardScheme.class, new QueryRecoveryResultStandardSchemeFactory());
        schemes.put(TupleScheme.class, new QueryRecoveryResultTupleSchemeFactory());
    }

    static {
        Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
        tmpMap.put(_Fields.TASKS, new org.apache.thrift.meta_data.FieldMetaData("tasks", org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET,
                        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ScheduledTask.class))));
        metaDataMap = Collections.unmodifiableMap(tmpMap);
        org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(QueryRecoveryResult.class, metaDataMap);
    }

    public Set<ScheduledTask> tasks; // required

    public QueryRecoveryResult() {
    }

    public QueryRecoveryResult(
            Set<ScheduledTask> tasks) {
        this();
        this.tasks = tasks;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public QueryRecoveryResult(QueryRecoveryResult other) {
        if (other.isSetTasks()) {
            Set<ScheduledTask> __this__tasks = new HashSet<ScheduledTask>(other.tasks.size());
            for (ScheduledTask other_element : other.tasks) {
                __this__tasks.add(new ScheduledTask(other_element));
            }
            this.tasks = __this__tasks;
        }
    }

    public QueryRecoveryResult deepCopy() {
        return new QueryRecoveryResult(this);
    }

    @Override
    public void clear() {
        this.tasks = null;
    }

    public int getTasksSize() {
        return (this.tasks == null) ? 0 : this.tasks.size();
    }

    public java.util.Iterator<ScheduledTask> getTasksIterator() {
        return (this.tasks == null) ? null : this.tasks.iterator();
    }

    public void addToTasks(ScheduledTask elem) {
        if (this.tasks == null) {
            this.tasks = new HashSet<ScheduledTask>();
        }
        this.tasks.add(elem);
    }

    public Set<ScheduledTask> getTasks() {
        return this.tasks;
    }

    public QueryRecoveryResult setTasks(Set<ScheduledTask> tasks) {
        this.tasks = tasks;
        return this;
    }

    public void unsetTasks() {
        this.tasks = null;
    }

    /**
     * Returns true if field tasks is set (has been assigned a value) and false otherwise
     */
    public boolean isSetTasks() {
        return this.tasks != null;
    }

    public void setTasksIsSet(boolean value) {
        if (!value) {
            this.tasks = null;
        }
    }

    public void setFieldValue(_Fields field, Object value) {
        switch (field) {
            case TASKS:
                if (value == null) {
                    unsetTasks();
                } else {
                    setTasks((Set<ScheduledTask>) value);
                }
                break;

        }
    }

    public Object getFieldValue(_Fields field) {
        switch (field) {
            case TASKS:
                return getTasks();

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
            case TASKS:
                return isSetTasks();
        }
        throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
        if (that == null)
            return false;
        if (that instanceof QueryRecoveryResult)
            return this.equals((QueryRecoveryResult) that);
        return false;
    }

    public boolean equals(QueryRecoveryResult that) {
        if (that == null)
            return false;

        boolean this_present_tasks = true && this.isSetTasks();
        boolean that_present_tasks = true && that.isSetTasks();
        if (this_present_tasks || that_present_tasks) {
            if (!(this_present_tasks && that_present_tasks))
                return false;
            if (!this.tasks.equals(that.tasks))
                return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        List<Object> list = new ArrayList<Object>();

        boolean present_tasks = true && (isSetTasks());
        list.add(present_tasks);
        if (present_tasks)
            list.add(tasks);

        return list.hashCode();
    }

    @Override
    public int compareTo(QueryRecoveryResult other) {
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }

        int lastComparison = 0;

        lastComparison = Boolean.valueOf(isSetTasks()).compareTo(other.isSetTasks());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetTasks()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tasks, other.tasks);
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
        StringBuilder sb = new StringBuilder("QueryRecoveryResult(");
        boolean first = true;

        sb.append("tasks:");
        if (this.tasks == null) {
            sb.append("null");
        } else {
            sb.append(this.tasks);
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
        TASKS((short) 1, "tasks");

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
                case 1: // TASKS
                    return TASKS;
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

    private static class QueryRecoveryResultStandardSchemeFactory implements SchemeFactory {
        public QueryRecoveryResultStandardScheme getScheme() {
            return new QueryRecoveryResultStandardScheme();
        }
    }

    private static class QueryRecoveryResultStandardScheme extends StandardScheme<QueryRecoveryResult> {

        public void read(org.apache.thrift.protocol.TProtocol iprot, QueryRecoveryResult struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();
            while (true) {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                    break;
                }
                switch (schemeField.id) {
                    case 1: // TASKS
                        if (schemeField.type == org.apache.thrift.protocol.TType.SET) {
                            {
                                org.apache.thrift.protocol.TSet _set286 = iprot.readSetBegin();
                                struct.tasks = new HashSet<ScheduledTask>(2 * _set286.size);
                                ScheduledTask _elem287;
                                for (int _i288 = 0; _i288 < _set286.size; ++_i288) {
                                    _elem287 = new ScheduledTask();
                                    _elem287.read(iprot);
                                    struct.tasks.add(_elem287);
                                }
                                iprot.readSetEnd();
                            }
                            struct.setTasksIsSet(true);
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

        public void write(org.apache.thrift.protocol.TProtocol oprot, QueryRecoveryResult struct) throws org.apache.thrift.TException {
            struct.validate();

            oprot.writeStructBegin(STRUCT_DESC);
            if (struct.tasks != null) {
                oprot.writeFieldBegin(TASKS_FIELD_DESC);
                {
                    oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, struct.tasks.size()));
                    for (ScheduledTask _iter289 : struct.tasks) {
                        _iter289.write(oprot);
                    }
                    oprot.writeSetEnd();
                }
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }

    }

    private static class QueryRecoveryResultTupleSchemeFactory implements SchemeFactory {
        public QueryRecoveryResultTupleScheme getScheme() {
            return new QueryRecoveryResultTupleScheme();
        }
    }

    private static class QueryRecoveryResultTupleScheme extends TupleScheme<QueryRecoveryResult> {

        @Override
        public void write(org.apache.thrift.protocol.TProtocol prot, QueryRecoveryResult struct) throws org.apache.thrift.TException {
            TTupleProtocol oprot = (TTupleProtocol) prot;
            BitSet optionals = new BitSet();
            if (struct.isSetTasks()) {
                optionals.set(0);
            }
            oprot.writeBitSet(optionals, 1);
            if (struct.isSetTasks()) {
                {
                    oprot.writeI32(struct.tasks.size());
                    for (ScheduledTask _iter290 : struct.tasks) {
                        _iter290.write(oprot);
                    }
                }
            }
        }

        @Override
        public void read(org.apache.thrift.protocol.TProtocol prot, QueryRecoveryResult struct) throws org.apache.thrift.TException {
            TTupleProtocol iprot = (TTupleProtocol) prot;
            BitSet incoming = iprot.readBitSet(1);
            if (incoming.get(0)) {
                {
                    org.apache.thrift.protocol.TSet _set291 = new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
                    struct.tasks = new HashSet<ScheduledTask>(2 * _set291.size);
                    ScheduledTask _elem292;
                    for (int _i293 = 0; _i293 < _set291.size; ++_i293) {
                        _elem292 = new ScheduledTask();
                        _elem292.read(iprot);
                        struct.tasks.add(_elem292);
                    }
                }
                struct.setTasksIsSet(true);
            }
        }
    }

}

