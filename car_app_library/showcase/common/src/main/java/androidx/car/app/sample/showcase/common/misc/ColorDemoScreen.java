/*
 * Copyright 2021 The Android Open Source Project
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

package androidx.car.app.sample.showcase.common.misc;

import static androidx.car.app.model.Action.BACK;
import static androidx.car.app.model.CarColor.BLUE;
import static androidx.car.app.model.CarColor.GREEN;
import static androidx.car.app.model.CarColor.PRIMARY;
import static androidx.car.app.model.CarColor.RED;
import static androidx.car.app.model.CarColor.SECONDARY;
import static androidx.car.app.model.CarColor.YELLOW;

import androidx.annotation.NonNull;
import androidx.car.app.CarContext;
import androidx.car.app.Screen;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.ListTemplate;
import androidx.car.app.model.Row;
import androidx.car.app.model.Template;
import androidx.car.app.sample.showcase.common.R;
import androidx.car.app.sample.showcase.common.common.Utils;
import androidx.core.graphics.drawable.IconCompat;

/** Creates a screen that demonstrate the usage of colored texts and icons in the library. */
public final class ColorDemoScreen extends Screen {
    public ColorDemoScreen(@NonNull CarContext carContext) {
        super(carContext);
    }

    @NonNull
    @Override
    public Template onGetTemplate() {
        ItemList.Builder listBuilder = new ItemList.Builder();

        String example1Text = getCarContext().getString(R.string.example_1_text);
        listBuilder.addItem(
                new Row.Builder()
                        .setTitle(getCarContext().getString(R.string.example_title, 1))
                        .addText(Utils.colorize(example1Text,
                                RED, 0, example1Text.length()))
                        .setImage(new CarIcon.Builder(
                                IconCompat.createWithResource(
                                        getCarContext(),
                                        R.drawable.ic_fastfood_white_48dp))
                                .setTint(RED)
                                .build())
                        .build());

        String example2Text = getCarContext().getString(R.string.example_2_text);
        listBuilder.addItem(
                new Row.Builder()
                        .setTitle(getCarContext().getString(R.string.example_title, 2))
                        .addText(Utils.colorize(example2Text,
                                GREEN, 0, example2Text.length()))
                        .setImage(new CarIcon.Builder(
                                IconCompat.createWithResource(
                                        getCarContext(),
                                        R.drawable.ic_fastfood_white_48dp))
                                .setTint(GREEN)
                                .build())
                        .build());

        String example3Text = getCarContext().getString(R.string.example_3_text);
        listBuilder.addItem(
                new Row.Builder()
                        .setTitle(getCarContext().getString(R.string.example_title, 3))
                        .addText(Utils.colorize(example3Text,
                                BLUE, 0, example3Text.length()))
                        .setImage(new CarIcon.Builder(
                                IconCompat.createWithResource(
                                        getCarContext(),
                                        R.drawable.ic_fastfood_white_48dp))
                                .setTint(BLUE)
                                .build())
                        .build());

        String example4Text = getCarContext().getString(R.string.example_4_text);
        listBuilder.addItem(
                new Row.Builder()
                        .setTitle(getCarContext().getString(R.string.example_title, 4))
                        .addText(Utils.colorize(example4Text,
                                YELLOW, 0, example4Text.length()))
                        .setImage(new CarIcon.Builder(
                                IconCompat.createWithResource(
                                        getCarContext(),
                                        R.drawable.ic_fastfood_white_48dp))
                                .setTint(YELLOW)
                                .build())
                        .build());

        String example5Text = getCarContext().getString(R.string.example_5_text);
        listBuilder.addItem(
                new Row.Builder()
                        .setTitle(getCarContext().getString(R.string.example_title, 5))
                        .addText(Utils.colorize(example5Text,
                                PRIMARY, 0, example5Text.length()))
                        .setImage(new CarIcon.Builder(
                                IconCompat.createWithResource(
                                        getCarContext(),
                                        R.drawable.ic_fastfood_white_48dp))
                                .setTint(PRIMARY)
                                .build())
                        .build());

        String example6Text = getCarContext().getString(R.string.example_6_text);
        listBuilder.addItem(
                new Row.Builder()
                        .setTitle(getCarContext().getString(R.string.example_title, 6))
                        .addText(
                                Utils.colorize(
                                        example6Text,
                                        SECONDARY, 0, example6Text.length()))
                        .setImage(new CarIcon.Builder(
                                IconCompat.createWithResource(
                                        getCarContext(),
                                        R.drawable.ic_fastfood_white_48dp))
                                .setTint(SECONDARY)
                                .build())
                        .build());

        return new ListTemplate.Builder()
                .setSingleList(listBuilder.build())
                .setTitle(getCarContext().getString(R.string.color_demo))
                .setHeaderAction(BACK)
                .build();
    }
}
