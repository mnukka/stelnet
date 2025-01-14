package stelnet.market.subject;

import java.util.Arrays;
import java.util.List;

import com.fs.starfarer.api.campaign.econ.MarketAPI;

import stelnet.filter.market.HasOfficer;
import stelnet.filter.market.MarketFilter;
import stelnet.filter.person.HasPersonality;
import stelnet.filter.person.IsOfficer;
import stelnet.filter.person.PersonFilter;

public class OfficerSubject extends PersonSubject {

    private String personality;

    public OfficerSubject(String p, MarketAPI m) {
        super(p + " officer", m);
        personality = p;
    }

    @Override
    public boolean canAcquire() {
        return true;
    }

    @Override
    public boolean isAvailable() {
        MarketFilter filter = new HasOfficer(personality);
        return filter.accept(market);
    }

    @Override
    protected List<PersonFilter> getFilters() {
        return Arrays.asList(new IsOfficer(), new HasPersonality(personality));
    }
}
