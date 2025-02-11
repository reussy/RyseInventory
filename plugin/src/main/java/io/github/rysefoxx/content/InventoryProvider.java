/*
 * MIT License
 *
 * Copyright (c) 2022. Rysefoxx
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 */

package io.github.rysefoxx.content;

import io.github.rysefoxx.pagination.InventoryContents;
import io.github.rysefoxx.pagination.RyseInventory;
import io.github.rysefoxx.pagination.SlideAnimation;
import org.bukkit.entity.Player;

/**
 * @author Rysefoxx | Rysefoxx#6772
 * @since 2/17/2022
 */
public interface InventoryProvider {

    /**
     * A method to update the contents of the inventory. By default, this method is executed 20 times a second.
     */
    default void update(Player player, InventoryContents contents) {
    }

    /**
     * A method to close the inventory.
     */
    default void close(Player player, RyseInventory inventory) {
    }

    /**
     * This method is called 1x. Namely, when the inventory is opened for the player.
     */
    default void init(Player player, InventoryContents contents) {
    }

    /**
     * This method is called 1x. Namely, when the inventory is opened for the player. Another parameter is the animation that can be started.
     */
    default void init(Player player, InventoryContents contents, SlideAnimation animation) {
    }

}
