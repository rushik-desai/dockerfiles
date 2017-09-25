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
package eu.europa.ec.leos.web.event.view;

public class LeaveViewEvent {

    private final String viewId;

    public LeaveViewEvent(String viewId) {
        this.viewId = viewId;
    }

    public String getViewId() {
        return viewId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LeaveViewEvent{");
        sb.append("viewId='").append(viewId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
