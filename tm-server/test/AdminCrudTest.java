import org.apache.deltaspike.testcontrol.api.junit.CdiTestRunner;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import ru.burmistrov.tm.api.service.IAdminService;
import ru.burmistrov.tm.api.service.IUserService;
import ru.burmistrov.tm.entity.User;
import ru.burmistrov.tm.entity.enumerated.Role;

import javax.inject.Inject;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

@RunWith(CdiTestRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AdminCrudTest {

    @Inject
    private IAdminService adminService;

    @Test
    public void t1_adminServicePersistTest() throws SQLException, NoSuchAlgorithmException, IOException {
        adminService.createUser("test", "test", "test", "test", "test", "@test", Role.COMMON_USER);
    }

    @Test
    public void t2_adminServiceUpdatePasswordTest() throws SQLException, NoSuchAlgorithmException {
        adminService.updatePassword("test", "test1");
    }

    @Test
    public void t3_adminServiceMergeTest() throws SQLException {
        adminService.updateUserByLogin("test", "test1", "test1", "test1", "@test1", Role.COMMON_USER);
    }

    @Test
    public void t4_adminServiceRemoveTest() throws SQLException {
        adminService.removeUserById(adminService.findOneByLogin("test").getId());
    }

}
