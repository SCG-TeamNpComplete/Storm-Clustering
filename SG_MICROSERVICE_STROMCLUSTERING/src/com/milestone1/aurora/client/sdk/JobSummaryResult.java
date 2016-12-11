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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-12-08")
public class JobSummaryResult implements org.apache.thrift.TBase<JobSummaryResult, JobSummaryResult._Fields>, java.io.Serializable, Cloneable, Comparable<JobSummaryResult> {
    // isset id assignments
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("JobSummaryResult");
    private static final org.apache.thrift.protocol.TField SUMMARIES_FIELD_DESC = new org.apache.thrift.protocol.TField("summaries", org.apache.thrift.protocol.TType.SET, (short) 1);
    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();

    static {
        schemes.put(StandardScheme.class, new JobSummaryResultStandardSchemeFactory());
        schemes.put(TupleScheme.class, new JobSummaryResultTupleSchemeFactory());
    }

    static {
        Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
        tmpMap.put(_Fields.SUMMARIES, new org.apache.thrift.meta_data.FieldMetaData("summaries", org.apache.thrift.TFieldRequirementType.DEFAULT,
                new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET,
                        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, JobSummary.class))));
        metaDataMap = Collections.unmodifiableMap(tmpMap);
        org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(JobSummaryResult.class, metaDataMap);
    }

    public Set<JobSummary> summaries; // required

    public JobSummaryResult() {
    }

    public JobSummaryResult(
            Set<JobSummary> summaries) {
        this();
        this.summaries = summaries;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public JobSummaryResult(JobSummaryResult other) {
        if (other.isSetSummaries()) {
            Set<JobSummary> __this__summaries = new HashSet<JobSummary>(other.summaries.size());
            for (JobSummary other_element : other.summaries) {
                __this__summaries.add(new JobSummary(other_element));
            }
            this.summaries = __this__summaries;
        }
    }

    public JobSummaryResult deepCopy() {
        return new JobSummaryResult(this);
    }

    @Override
    public void clear() {
        this.summaries = null;
    }

    public int getSummariesSize() {
        return (this.summaries == null) ? 0 : this.summaries.size();
    }

    public java.util.Iterator<JobSummary> getSummariesIterator() {
        return (this.summaries == null) ? null : this.summaries.iterator();
    }

    public void addToSummaries(JobSummary elem) {
        if (this.summaries == null) {
            this.summaries = new HashSet<JobSummary>();
        }
        this.summaries.add(elem);
    }

    public Set<JobSummary> getSummaries() {
        return this.summaries;
    }

    public JobSummaryResult setSummaries(Set<JobSummary> summaries) {
        this.summaries = summaries;
        return this;
    }

    public void unsetSummaries() {
        this.summaries = null;
    }

    /**
     * Returns true if field summaries is set (has been assigned a value) and false otherwise
     */
    public boolean isSetSummaries() {
        return this.summaries != null;
    }

    public void setSummariesIsSet(boolean value) {
        if (!value) {
            this.summaries = null;
        }
    }

    public void setFieldValue(_Fields field, Object value) {
        switch (field) {
            case SUMMARIES:
                if (value == null) {
                    unsetSummaries();
                } else {
                    setSummaries((Set<JobSummary>) value);
                }
                break;

        }
    }

    public Object getFieldValue(_Fields field) {
        switch (field) {
            case SUMMARIES:
                return getSummaries();

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
            case SUMMARIES:
                return isSetSummaries();
        }
        throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
        if (that == null)
            return false;
        if (that instanceof JobSummaryResult)
            return this.equals((JobSummaryResult) that);
        return false;
    }

    public boolean equals(JobSummaryResult that) {
        if (that == null)
            return false;

        boolean this_present_summaries = true && this.isSetSummaries();
        boolean that_present_summaries = true && that.isSetSummaries();
        if (this_present_summaries || that_present_summaries) {
            if (!(this_present_summaries && that_present_summaries))
                return false;
            if (!this.summaries.equals(that.summaries))
                return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        List<Object> list = new ArrayList<Object>();

        boolean present_summaries = true && (isSetSummaries());
        list.add(present_summaries);
        if (present_summaries)
            list.add(summaries);

        return list.hashCode();
    }

    @Override
    public int compareTo(JobSummaryResult other) {
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }

        int lastComparison = 0;

        lastComparison = Boolean.valueOf(isSetSummaries()).compareTo(other.isSetSummaries());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetSummaries()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.summaries, other.summaries);
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
        StringBuilder sb = new StringBuilder("JobSummaryResult(");
        boolean first = true;

        sb.append("summaries:");
        if (this.summaries == null) {
            sb.append("null");
        } else {
            sb.append(this.summaries);
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
        SUMMARIES((short) 1, "summaries");

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
                case 1: // SUMMARIES
                    return SUMMARIES;
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

    private static class JobSummaryResultStandardSchemeFactory implements SchemeFactory {
        public JobSummaryResultStandardScheme getScheme() {
            return new JobSummaryResultStandardScheme();
        }
    }

    private static class JobSummaryResultStandardScheme extends StandardScheme<JobSummaryResult> {

        public void read(org.apache.thrift.protocol.TProtocol iprot, JobSummaryResult struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();
            while (true) {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                    break;
                }
                switch (schemeField.id) {
                    case 1: // SUMMARIES
                        if (schemeField.type == org.apache.thrift.protocol.TType.SET) {
                            {
                                org.apache.thrift.protocol.TSet _set318 = iprot.readSetBegin();
                                struct.summaries = new HashSet<JobSummary>(2 * _set318.size);
                                JobSummary _elem319;
                                for (int _i320 = 0; _i320 < _set318.size; ++_i320) {
                                    _elem319 = new JobSummary();
                                    _elem319.read(iprot);
                                    struct.summaries.add(_elem319);
                                }
                                iprot.readSetEnd();
                            }
                            struct.setSummariesIsSet(true);
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

        public void write(org.apache.thrift.protocol.TProtocol oprot, JobSummaryResult struct) throws org.apache.thrift.TException {
            struct.validate();

            oprot.writeStructBegin(STRUCT_DESC);
            if (struct.summaries != null) {
                oprot.writeFieldBegin(SUMMARIES_FIELD_DESC);
                {
                    oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, struct.summaries.size()));
                    for (JobSummary _iter321 : struct.summaries) {
                        _iter321.write(oprot);
                    }
                    oprot.writeSetEnd();
                }
                oprot.writeFieldEnd();
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }

    }

    private static class JobSummaryResultTupleSchemeFactory implements SchemeFactory {
        public JobSummaryResultTupleScheme getScheme() {
            return new JobSummaryResultTupleScheme();
        }
    }

    private static class JobSummaryResultTupleScheme extends TupleScheme<JobSummaryResult> {

        @Override
        public void write(org.apache.thrift.protocol.TProtocol prot, JobSummaryResult struct) throws org.apache.thrift.TException {
            TTupleProtocol oprot = (TTupleProtocol) prot;
            BitSet optionals = new BitSet();
            if (struct.isSetSummaries()) {
                optionals.set(0);
            }
            oprot.writeBitSet(optionals, 1);
            if (struct.isSetSummaries()) {
                {
                    oprot.writeI32(struct.summaries.size());
                    for (JobSummary _iter322 : struct.summaries) {
                        _iter322.write(oprot);
                    }
                }
            }
        }

        @Override
        public void read(org.apache.thrift.protocol.TProtocol prot, JobSummaryResult struct) throws org.apache.thrift.TException {
            TTupleProtocol iprot = (TTupleProtocol) prot;
            BitSet incoming = iprot.readBitSet(1);
            if (incoming.get(0)) {
                {
                    org.apache.thrift.protocol.TSet _set323 = new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
                    struct.summaries = new HashSet<JobSummary>(2 * _set323.size);
                    JobSummary _elem324;
                    for (int _i325 = 0; _i325 < _set323.size; ++_i325) {
                        _elem324 = new JobSummary();
                        _elem324.read(iprot);
                        struct.summaries.add(_elem324);
                    }
                }
                struct.setSummariesIsSet(true);
            }
        }
    }

}

