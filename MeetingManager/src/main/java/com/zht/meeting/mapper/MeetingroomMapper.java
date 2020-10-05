package com.zht.meeting.mapper;

import com.zht.meeting.pojo.Meetingroom;
import com.zht.meeting.pojo.MeetingroomExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MeetingroomMapper {
    int countByExample(MeetingroomExample example);

    int deleteByExample(MeetingroomExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Meetingroom record);

    int insertSelective(Meetingroom record);

    List<Meetingroom> selectByExample(MeetingroomExample example);

    Meetingroom selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Meetingroom record, @Param("example") MeetingroomExample example);

    int updateByExample(@Param("record") Meetingroom record, @Param("example") MeetingroomExample example);

    int updateByPrimaryKeySelective(Meetingroom record);

    int updateByPrimaryKey(Meetingroom record);
}