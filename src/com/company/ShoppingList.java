package com.company;

import java.util.ArrayList;

public class ShoppingList {
    public ArrayList<String> shopingList = new ArrayList<String> ();


    // This is for adding an item.
    public void addItemToList (String item){
        shopingList.add(item);
    }

    // For show the list
    public void showItems (){
        if (shopingList.size() == 0){
            System.out.print("There is no item in your list.");
        }
        else{
            System.out.println("You have "+shopingList.size()+" items.");
            for (int i=0; i< shopingList.size();i++){
                System.out.println((i + 1) + ". " + shopingList.get(i));
            }
        }
    }


    public void modifyItem (String oldItem, String newItem){
        int position = gotoItem(oldItem);
        if (position >= 0){
            modifyItem(position, newItem);
        }
    }

    private void modifyItem (int position, String newName){
        shopingList.set(position-1, newName);
        System.out.println((position+1) + ". Item has been removed.");
    }


    // Remove part:
    public void removeItem (String removeItem){
        int position = gotoItem(removeItem);
        if (position >= 0){
            removeItem(position);
        }
    }
    // This is code for removing item from the list with position.
    private void removeItem (int position){
        shopingList.remove(position-1);
    }


    // This code is for searching items through the list.
    public int gotoItem (String seekItem){
        return shopingList.indexOf(seekItem);
    }

    // Checking for an item on the list.
    public boolean existsQ (String qItem){
        int position = gotoItem(qItem);
        if (position >= 0){
            return true;
        }
        else {
            return false;
        }
    }
}
