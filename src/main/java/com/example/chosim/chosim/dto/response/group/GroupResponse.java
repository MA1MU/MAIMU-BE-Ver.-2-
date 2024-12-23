package com.example.chosim.chosim.dto.response.group;

import com.example.chosim.chosim.domain.Maimu;
import com.example.chosim.chosim.domain.group.Group;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
public class GroupResponse {

    private final Long id;
    private final String groupName;
    private final String groupColor;
    private final Integer maimuCount;

    public GroupResponse(Group group){
        this.id = group.getId();
        this.groupName = group.getGroupName();
        this.groupColor = group.getGroupColor();
        this.maimuCount = group.getMaimus().size();
    }

    @Builder
    public GroupResponse(Long id, String groupName, String groupColor, Integer maimuCount){
        this.id = id;
        this.groupName = groupName.substring(0, Math.min(groupName.length(), 20));
        this.groupColor = groupColor;
        this.maimuCount = maimuCount;
    }
}