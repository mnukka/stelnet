package stelnet.filter.person;

import com.fs.starfarer.api.campaign.CommDirectoryEntryAPI;
import com.fs.starfarer.api.characters.PersonAPI;
import com.fs.starfarer.api.impl.campaign.ids.Ranks;

import stelnet.helper.LogHelper;

public class IsOfficer implements PersonFilter {

    @Override
    public boolean accept(CommDirectoryEntryAPI entry) {
        PersonAPI person = (PersonAPI) entry.getEntryData();
        String postId = person.getPostId();
        LogHelper.debug(String.format("Considering %s (%s)", person.getNameString(), postId));
        return postId.equals(Ranks.POST_OFFICER_FOR_HIRE);
    }
}
