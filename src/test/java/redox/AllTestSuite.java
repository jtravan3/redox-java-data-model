package redox;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import redox.datamodel.clinicalsummary.patientpush.PatientPushTestSuite;
import redox.datamodel.clinicalsummary.patientquery.PatientQueryTestSuite;
import redox.datamodel.clinicalsummary.patientqueryresponse.PatientQueryResponseTestSuite;
import redox.datamodel.media.newmedia.NewMediaTestSuite;
import redox.datamodel.media.replace.ReplaceTestSuite;
import redox.services.RedoxDataModelFactoryTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        PatientPushTestSuite.class,
        PatientQueryTestSuite.class,
        PatientQueryResponseTestSuite.class,
        ReplaceTestSuite.class,
        NewMediaTestSuite.class,
        RedoxDataModelFactoryTest.class})
public class AllTestSuite {
}
