import org.jetbrains.annotations.Nullable;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ru.burmistrov.tm.api.service.IProjectService;
import ru.burmistrov.tm.configuration.SpringConfiguration;
import ru.burmistrov.tm.entity.Project;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.text.ParseException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfiguration.class})
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ProjectCrudTest {

    @Autowired
    private IProjectService projectService;

    @Test
    public void t1_projectServicePersistTest() throws SQLException, NoSuchAlgorithmException, ParseException, IOException {
        projectService.persist("6c931f71-719c-44c7-a777-725957da3e7b", "test", "test", "11.11.2021", "Готово");
        Assert.assertNotNull(projectService.findOneByName("6c931f71-719c-44c7-a777-725957da3e7b" ,"test"));
    }

    @Test
    public void t2_projectServiceMergeTest() throws ParseException, SQLException {
        @Nullable final Project project = projectService.findOneByName("6c931f71-719c-44c7-a777-725957da3e7b", "test");
        Assert.assertNotNull(project);
        projectService.merge
                ("6c931f71-719c-44c7-a777-725957da3e7b",project.getId(),"test1", "test1", "12.12.2021", "В процессе");
        Assert.assertNotNull(projectService.findOneByName("6c931f71-719c-44c7-a777-725957da3e7b" ,"test1"));
    }

    @Test
    public void t3_projectServiceFindAllTest() throws SQLException {
        Assert.assertNotNull(projectService.findAll("6c931f71-719c-44c7-a777-725957da3e7b"));
    }

    @Test
    public void t4_projectServiceFindOneByDescriptionTest() throws SQLException {
        Assert.assertNotNull(projectService.findOneByDescription("6c931f71-719c-44c7-a777-725957da3e7b", "test1"));
    }

    @Test
    public void t5_projectServiceFindOneByNameTest() throws SQLException {
        Assert.assertNotNull(projectService.findOneByName("6c931f71-719c-44c7-a777-725957da3e7b", "test1"));
    }


    @Test
    public void t6_projectServiceFindAllSortByDateBeginTest() throws SQLException {
        Assert.assertNotNull(projectService.findAllSortByDateBegin("6c931f71-719c-44c7-a777-725957da3e7b"));
    }


    @Test
    public void t7_projectServiceFindAllSortByDateEndTest() throws SQLException {
        Assert.assertNotNull(projectService.findAllSortByDateEnd("6c931f71-719c-44c7-a777-725957da3e7b"));
    }

    @Test
    public void t8_projectServiceFindAllSortByStatusTest() throws SQLException {
        Assert.assertNotNull(projectService.findAllSortByStatus("6c931f71-719c-44c7-a777-725957da3e7b"));
    }

    @Test
    public void t9_projectServiceRemoveTest() throws SQLException {
        @Nullable final Project project = projectService.findOneByName("6c931f71-719c-44c7-a777-725957da3e7b", "test1");
        Assert.assertNotNull(project);
        projectService.remove
                ("6c931f71-719c-44c7-a777-725957da3e7b", project.getId());
        Assert.assertNull(projectService.findOneByName("6c931f71-719c-44c7-a777-725957da3e7b" ,"test1"));
    }

}
