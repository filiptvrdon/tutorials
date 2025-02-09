package keymap;

import java.util.ArrayList;
import java.util.List;

public class KeyBoardShortcuts {

    private List<String> shortcuts = new ArrayList<>();

    public static void main(String[] args) {
        KeyBoardShortcuts keyBoardShortcuts = new KeyBoardShortcuts();
        keyBoardShortcuts.loadShortcuts();
        keyBoardShortcuts.printShortcuts();
    }

    private void loadShortcuts() {
        // BASIC NAVIGATION
        shortcuts.add("ALT + 1 - project structure view");
        shortcuts.add("ALT + 2 - file structure");
        shortcuts.add("ALT + 3 - terminal");
        shortcuts.add("ALT + 4 - run window");
        shortcuts.add("ALT + 5 - debug window");
        shortcuts.add("ALT + 6 - issues window");
        shortcuts.add("ALT + 0 - git window");

        // FILE NAVIGATION
        shortcuts.add("CTRL + SHIFT + 1, 1 - open current file in project tree");
        shortcuts.add("CTRL + SHIFT + F - find in files (tip: search within selected file structure, edit search results)");
        shortcuts.add("2x SHIFT - find anything anywhere");
        shortcuts.add("CTRL + E - recent files (searchable)");
        shortcuts.add("CTRL + T - re-open most recent file (multiple steps back, like a browser)");

        // EDITOR
        shortcuts.add("CTRL + F - find");
        shortcuts.add("CTRL + H - replace");

        // Find/Replace options
        shortcuts.add("ALT + W - find only whole words");
        shortcuts.add("ALT + C - case sensitive search");

        // Editing lines
        shortcuts.add("CTRL + D - delete line (custom)");
        shortcuts.add("CTRL + SHIFT + UP/DOWN - duplicate line above/below");
        shortcuts.add("CTRL + ALT + UP/DOWN - move line up/down");
    }

    private void printShortcuts() {
        for (String shortcut : shortcuts) {
            printShortcut(shortcut);
        }
    }

    private void printShortcut(String shortcut) {
        System.out.println(shortcut);
    }
}
