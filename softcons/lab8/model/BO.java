/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softcons.lab8.model;
import java.util.ArrayList;
//import dao.HullDao;
import dao.CloDao;
import dao.ContentDao;
import entity.Clo;
import entity.Content;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import softcons.lab8.model.Hull;
/**
 *
 * @author ibrah
 */
public class BO {
    public void addClo(int id,String level,String desc,String name,String plo)
    {
        CloDao clodao = new CloDao();
        Clo clo = new Clo();
        clo.setName(name);
        clo.setDescription(desc);
        clo.setPlo(plo);
        clo.setCloId(id);
        clo.setBtLevel(level);
        clodao.addClo(clo);
    }
    
    public void addContent(String title,String desc, Date start, Date end)
    {
        ContentDao cn= new ContentDao();
        Content ct = new Content();
        ct.setTitle(title);
        ct.setDescription(desc);
        ct.setStarttime(start);
        ct.setEndtime(end);
        cn.addContent(ct);
        
    }
}
