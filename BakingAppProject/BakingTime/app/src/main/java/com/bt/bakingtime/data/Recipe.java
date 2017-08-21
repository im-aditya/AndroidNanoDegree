package com.bt.bakingtime.data;

import java.util.ArrayList;

/**
 * Created by Aditya on 8/17/2017.
 */

public class Recipe
{
    private String mId;
    private String mRecipeName;
    private String mServings;
    private String mImageUrl;

    private ArrayList<Ingredients> mIngrediants;
    private ArrayList<RecipeStep> mRecipeSteps;

    public Recipe(String id, String recipeName, String servings, String imageUrl)
    {
        mId = id;
        mRecipeName = recipeName;
        mServings = servings;
        mImageUrl = imageUrl;

        mIngrediants = new ArrayList<Ingredients>();
        mRecipeSteps = new ArrayList<RecipeStep>();
    }

    public void addIngredient(Ingredients ingredients)
    {
        mIngrediants.add(ingredients);
    }

    public void addRecipeStep(RecipeStep recipeStep)
    {
        mRecipeSteps.add(recipeStep);
    }

    public String getId()
    {
        return mId;
    }

    public String getRecipeName()
    {
        return mRecipeName;
    }

    public String getServings()
    {
        return mServings;
    }

    public String getImageUrl()
    {
        return mImageUrl;
    }

    public ArrayList<Ingredients> getIngrediants()
    {
        return mIngrediants;
    }

    public ArrayList<RecipeStep> getRecipeSteps()
    {
        return mRecipeSteps;
    }

    public static class Ingredients
    {
        private String mQuantity;
        private String mMeasure;
        private String mIngredient;

        public Ingredients(String quantity, String measure, String ingredient)
        {
            mQuantity = quantity;
            mMeasure = measure;
            mIngredient = ingredient;
        }

        public String getQuantity()
        {
            return mQuantity;
        }

        public String getMeasure()
        {
            return mMeasure;
        }

        public String getIngredient()
        {
            return mIngredient;
        }
    }

    public static class RecipeStep
    {
        private String mId;
        private String mShortDescription;
        private String mLongDescription;
        private String mVideoUrl;
        private String mThumbnailUrl;

        public RecipeStep(String id, String shortDescription, String longDescription, String videoUrl, String thumbnailUrl)
        {
            mId = id;
            mShortDescription = shortDescription;
            mLongDescription = longDescription;
            mVideoUrl = videoUrl;
            mThumbnailUrl = thumbnailUrl;
        }


        public String getId()
        {
            return mId;
        }

        public String getShortDescription()
        {
            return mShortDescription;
        }

        public String getLongDescription()
        {
            return mLongDescription;
        }

        public String getVideoUrl()
        {
            return mVideoUrl;
        }

        public String getThumbnailUrl()
        {
            return mThumbnailUrl;
        }
    }
}