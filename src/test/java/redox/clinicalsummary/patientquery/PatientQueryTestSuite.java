package redox.clinicalsummary.patientquery;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import redox.clinicalsummary.patientpush.PatientPushTest_Myra;
import redox.clinicalsummary.patientpush.PatientPushTest_Sample;
import redox.clinicalsummary.patientpush.PatientPushTest_Timothy;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        PatientPushTest_Sample.class,
        PatientPushTest_Myra.class,
        PatientPushTest_Timothy.class})
public class PatientQueryTestSuite {
}
