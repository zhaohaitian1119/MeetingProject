package com.zht.meeting.controller;

import com.zht.meeting.pojo.Meetingroom;
import com.zht.meeting.service.MeetingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-05 16:32
 */
@Controller
public class MeetingController {

    @Resource
    MeetingService meetingService;

    @RequestMapping("/")
    public String info(Model model){
        List<Meetingroom> meetingrooms = meetingService.selAll();
        model.addAttribute("meeting",meetingrooms);
        return "index";
    }

    @RequestMapping("/add")
    public String add(HttpServletRequest request){
        String name = request.getParameter("name");
        String meetingname = request.getParameter("meetingname");
        String meetingorder = request.getParameter("meetingorder");
        SimpleDateFormat simdate1=new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = null;
        try {
            date1 = simdate1.parse(meetingorder);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Meetingroom meetingroom = new Meetingroom();
        meetingroom.setAdvanceName(name);
        meetingroom.setMeetingOrder(date1);
        meetingroom.setMeetingName(meetingname);
        meetingService.insertMeeting(meetingroom);
        return "redirect:/";
    }
}
