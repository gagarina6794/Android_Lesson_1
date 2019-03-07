package ru.javaops.android.tamagotchi.utils;

import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;

import java.util.regex.Pattern;

public class PetUtils {

    public static boolean checkName(Context context, String name) {
        if (name.isEmpty() || name.replace(" ", "").isEmpty()) {
            return makeMessage(context, "Имя не должно быть пустым!");
        } else {
            if (name.trim().length() > 15) {
                return makeMessage(context,
                        "Имя не должно быть длиннее 15 символов");
            } else {
                if (!Pattern.matches("\\w+", name.replace(" ", ""))) {
                    return makeMessage(context, "Некорректное имя!");
                } else {
                    return true;
                }
            }
        }
    }

    private static boolean makeMessage(Context context, String message) {
        Toast toast = Toast.makeText(context,
                message, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
        return false;
    }
}
