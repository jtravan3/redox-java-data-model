package redox.datamodel.clinicalsummary.patientpush;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        PatientPushTest_Sample.class,
        PatientPushTest_Myra.class,
        PatientPushTest_Timothy.class})
public class PatientPushTestSuite {
}
