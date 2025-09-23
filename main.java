{
  "nbformat": 4,
  "nbformat_minor": 0,
  "metadata": {
    "colab": {
      "provenance": [],
      "authorship_tag": "ABX9TyMIkxPeb3knkTHnCmr+EcwZ",
      "include_colab_link": true
    },
    "kernelspec": {
      "name": "python3",
      "display_name": "Python 3"
    },
    "language_info": {
      "name": "python"
    }
  },
  "cells": [
    {
      "cell_type": "markdown",
      "metadata": {
        "id": "view-in-github",
        "colab_type": "text"
      },
      "source": [
        "<a href=\"https://colab.research.google.com/github/JuanSebastianSantos/PROGCOM-A/blob/main/main.java\" target=\"_parent\"><img src=\"https://colab.research.google.com/assets/colab-badge.svg\" alt=\"Open In Colab\"/></a>"
      ]
    },
    {
      "cell_type": "code",
      "execution_count": null,
      "metadata": {
        "id": "HIjr9ZyZTY1Y"
      },
      "outputs": [],
      "source": [
        "import java.util.*;\n",
        "\n",
        "public class Main {\n",
        "    public static void main(String[] args) {\n",
        "        List<Integer> cuadra = new ArrayList<>();\n",
        "        for (int x = 1; x <= 10; x++) {\n",
        "            cuadra.add(x * x);\n",
        "        }\n",
        "        System.out.println(\"Cuadrados del 1 al 10: \" + cuadra);\n",
        "    }\n",
        "}"
      ]
    }
  ]
}