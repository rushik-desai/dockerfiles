/**
 * Copyright 2016 European Commission
 *
 * Licensed under the EUPL, Version 1.1 or – as soon they will be approved by the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence.
 * You may obtain a copy of the Licence at:
 *
 *     https://joinup.ec.europa.eu/software/page/eupl
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the Licence is distributed on an "AS IS" basis,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Licence for the specific language governing permissions and limitations under the Licence.
 */
package eu.europa.ec.leos.web.presenter;

import com.google.common.eventbus.Subscribe;
import eu.europa.ec.leos.web.event.view.logout.EnterLogoutViewEvent;
import eu.europa.ec.leos.web.view.LogoutView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
@Component
public class LogoutPresenter extends AbstractPresenter<LogoutView> {

    private static final Logger LOG = LoggerFactory.getLogger(LogoutPresenter.class);

    @Autowired
    private LogoutView logoutView;

    @Subscribe
    public void enterLogoutView(EnterLogoutViewEvent event) {
        LOG.trace("Logging out from Leos...");
        session.invalidate(); // Logout from the session
    }

    @Override
    public LogoutView getView() {
        return logoutView;
    }

}
