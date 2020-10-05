package com.zht.meeting.service.impl;

import com.zht.meeting.mapper.MeetingroomMapper;
import com.zht.meeting.pojo.Meetingroom;
import com.zht.meeting.service.MeetingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-05 16:37
 */
@Service("meetingService")
public class MeetingServiceImpl implements MeetingService {

    @Resource
    MeetingroomMapper meetingroomMapper;

    @Override
    public List<Meetingroom> selAll() {
        List<Meetingroom> meetingrooms = meetingroomMapper.selectByExample(null);
        return meetingrooms;
    }

    @Override
    public int insertMeeting(Meetingroom meetingroom) {
        int i = meetingroomMapper.insertSelective(meetingroom);
        return i;
    }
}
