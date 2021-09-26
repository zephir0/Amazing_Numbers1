class Article implements Comparable<Article> {
    private String title;
    private int size;

    public Article(String title, int size) {
        this.title = title;
        this.size = size;
    }

    public String getTitle() {
        return this.title;
    }

    public int getSize() {
        return this.size;
    }

    @Override
    public int compareTo(Article otherArticle) {
        int comparisonResult;
        if (Integer.valueOf(getSize()).compareTo(otherArticle.getSize()) == 0) {
            comparisonResult = 0;
        } else if (Integer.valueOf(getSize()).compareTo(otherArticle.getSize()) >= 1) {
            return comparisonResult = 1;
        } else if (Integer.valueOf(getSize()).compareTo(otherArticle.getSize()) <= 1) {
            return comparisonResult = -1;
        } else

            return Integer.valueOf(getTitle().compareTo(otherArticle.getTitle()));

        return Integer.valueOf(getTitle().compareTo(otherArticle.getTitle()));


    }
}