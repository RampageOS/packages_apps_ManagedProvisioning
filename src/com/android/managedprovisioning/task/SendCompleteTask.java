/*
 * Copyright 2014, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.managedprovisioning.task;

import com.android.managedprovisioning.DeviceOwnerProvisioningActivity.ProvisioningState;

public class SendCompleteTask extends ProvisionTask {

    public SendCompleteTask() {
        super("Send Complete Task");
    }

    @Override
    public void executeTask(String... params) {
      mTaskManager.getPreferences().setDoesntNeedResume(true);
      mTaskManager.registerProvisioningState(ProvisioningState.SETUP_COMPLETE, "");
      onSuccess();
    }

    @Override
    public void shutdown() {

    }

    @Override
    public void hasFailed() {
        // Has no failure state.
    }

}