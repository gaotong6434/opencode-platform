package cn.meteor.opencode.platform.web.controller;


import cn.meteor.opencode.platform.entity.User;
import cn.meteor.opencode.platform.service.IUserService;
import cn.meteor.opencode.platform.util.UploadFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService iUserService;

    @RequestMapping("/select")
    @ResponseBody
    public List<User> select(@RequestParam("username") String userneme){
        System.out.println(iUserService.select(userneme).toString());
        System.out.println(userneme);
        return iUserService.select(userneme);
    }

    @RequestMapping("/update")
    @ResponseBody
    //更新除头像以外的资料
    public Boolean update( User user){
       try {
           System.out.println(user);
           iUserService.update(user,user.getUserId());
           return true;
       }catch (Exception e){
           e.printStackTrace();
           return false;
       }
    }


    @RequestMapping("/updateavatar")
    @ResponseBody
    //更新头像
    public Boolean updateavatar( @RequestParam("file")  MultipartFile file,User user){
        try {
            String files = UploadFile.uploadFiles(file);
            user.setAvatar(files);
            iUserService.update(user,user.getUserId());
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }


    @RequestMapping("/upfile")
    @ResponseBody
    public String upfile(@RequestParam("file")  MultipartFile file){
        try {

//            CommonsMultipartFile commonsMultipartFile = (CommonsMultipartFile)file;
//            DiskFileItem fileItem = (DiskFileItem)commonsMultipartFile.getFileItem();
//            file.transferTo((File) file);
            System.out.println("我进来了");
            //System.out.println(file.getAbsolutePath());
            String files = UploadFile.uploadFiles(file);
            return files;

        }catch (Exception e){
            e.printStackTrace();
            return "传个鬼，你个垃圾失败了，叫你们组长来";
        }

    }
}
