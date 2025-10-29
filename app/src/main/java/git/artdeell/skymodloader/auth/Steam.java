package git.artdeell.skymodloader.auth;

import com.tgc.sky.accounts.SystemAccountType;

public class Steam extends WebLogin {
    public Steam() {
        super("Steam", SystemAccountType.kSystemAccountType_Steam);
    }
}
