/**
 * Autogenerated by Thrift Compiler (0.9.3)
 * <p>
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *
 * @generated
 */
package iu.edu.teambash.aurora.client.sdk;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
public class aurora_apiConstants {

    public static final String AURORA_EXECUTOR_NAME = "AuroraExecutor";

    public static final Set<ScheduleStatus> ACTIVE_STATES = new HashSet<ScheduleStatus>();
    public static final Set<ScheduleStatus> SLAVE_ASSIGNED_STATES = new HashSet<ScheduleStatus>();
    public static final Set<ScheduleStatus> LIVE_STATES = new HashSet<ScheduleStatus>();
    public static final Set<ScheduleStatus> TERMINAL_STATES = new HashSet<ScheduleStatus>();
    public static final String GOOD_IDENTIFIER_PATTERN = "^[\\w\\-\\.]+$";
    public static final String GOOD_IDENTIFIER_PATTERN_JVM = "^[\\w\\-\\.]+$";
    public static final String GOOD_IDENTIFIER_PATTERN_PYTHON = "^[\\w\\-\\.]+$";
    /**
     * States the job update can be in while still considered active.
     */
    public static final Set<JobUpdateStatus> ACTIVE_JOB_UPDATE_STATES = new HashSet<JobUpdateStatus>();
    public static final String BYPASS_LEADER_REDIRECT_HEADER_NAME = "Bypass-Leader-Redirect";
    public static final String TASK_FILESYSTEM_MOUNT_POINT = "taskfs";

    static {
        ACTIVE_STATES.add(iu.edu.teambash.aurora.client.sdk.ScheduleStatus.ASSIGNED);
        ACTIVE_STATES.add(iu.edu.teambash.aurora.client.sdk.ScheduleStatus.DRAINING);
        ACTIVE_STATES.add(iu.edu.teambash.aurora.client.sdk.ScheduleStatus.KILLING);
        ACTIVE_STATES.add(iu.edu.teambash.aurora.client.sdk.ScheduleStatus.PENDING);
        ACTIVE_STATES.add(iu.edu.teambash.aurora.client.sdk.ScheduleStatus.PREEMPTING);
        ACTIVE_STATES.add(iu.edu.teambash.aurora.client.sdk.ScheduleStatus.RESTARTING);
        ACTIVE_STATES.add(iu.edu.teambash.aurora.client.sdk.ScheduleStatus.RUNNING);
        ACTIVE_STATES.add(iu.edu.teambash.aurora.client.sdk.ScheduleStatus.STARTING);
        ACTIVE_STATES.add(iu.edu.teambash.aurora.client.sdk.ScheduleStatus.THROTTLED);
    }

    static {
        SLAVE_ASSIGNED_STATES.add(iu.edu.teambash.aurora.client.sdk.ScheduleStatus.ASSIGNED);
        SLAVE_ASSIGNED_STATES.add(iu.edu.teambash.aurora.client.sdk.ScheduleStatus.DRAINING);
        SLAVE_ASSIGNED_STATES.add(iu.edu.teambash.aurora.client.sdk.ScheduleStatus.KILLING);
        SLAVE_ASSIGNED_STATES.add(iu.edu.teambash.aurora.client.sdk.ScheduleStatus.PREEMPTING);
        SLAVE_ASSIGNED_STATES.add(iu.edu.teambash.aurora.client.sdk.ScheduleStatus.RESTARTING);
        SLAVE_ASSIGNED_STATES.add(iu.edu.teambash.aurora.client.sdk.ScheduleStatus.RUNNING);
        SLAVE_ASSIGNED_STATES.add(iu.edu.teambash.aurora.client.sdk.ScheduleStatus.STARTING);
    }

    static {
        LIVE_STATES.add(iu.edu.teambash.aurora.client.sdk.ScheduleStatus.KILLING);
        LIVE_STATES.add(iu.edu.teambash.aurora.client.sdk.ScheduleStatus.PREEMPTING);
        LIVE_STATES.add(iu.edu.teambash.aurora.client.sdk.ScheduleStatus.RESTARTING);
        LIVE_STATES.add(iu.edu.teambash.aurora.client.sdk.ScheduleStatus.DRAINING);
        LIVE_STATES.add(iu.edu.teambash.aurora.client.sdk.ScheduleStatus.RUNNING);
    }

    static {
        TERMINAL_STATES.add(iu.edu.teambash.aurora.client.sdk.ScheduleStatus.FAILED);
        TERMINAL_STATES.add(iu.edu.teambash.aurora.client.sdk.ScheduleStatus.FINISHED);
        TERMINAL_STATES.add(iu.edu.teambash.aurora.client.sdk.ScheduleStatus.KILLED);
        TERMINAL_STATES.add(iu.edu.teambash.aurora.client.sdk.ScheduleStatus.LOST);
    }

    static {
        ACTIVE_JOB_UPDATE_STATES.add(iu.edu.teambash.aurora.client.sdk.JobUpdateStatus.ROLLING_FORWARD);
        ACTIVE_JOB_UPDATE_STATES.add(iu.edu.teambash.aurora.client.sdk.JobUpdateStatus.ROLLING_BACK);
        ACTIVE_JOB_UPDATE_STATES.add(iu.edu.teambash.aurora.client.sdk.JobUpdateStatus.ROLL_FORWARD_PAUSED);
        ACTIVE_JOB_UPDATE_STATES.add(iu.edu.teambash.aurora.client.sdk.JobUpdateStatus.ROLL_BACK_PAUSED);
        ACTIVE_JOB_UPDATE_STATES.add(iu.edu.teambash.aurora.client.sdk.JobUpdateStatus.ROLL_FORWARD_AWAITING_PULSE);
        ACTIVE_JOB_UPDATE_STATES.add(iu.edu.teambash.aurora.client.sdk.JobUpdateStatus.ROLL_BACK_AWAITING_PULSE);
    }

}
