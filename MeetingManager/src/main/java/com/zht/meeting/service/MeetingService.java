package com.zht.meeting.service;

import com.zht.meeting.pojo.Meetingroom;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-05 16:36
 */
public interface MeetingService {
    List<Meetingroom> selAll();
    int insertMeeting(Meetingroom meetingroom);
}
