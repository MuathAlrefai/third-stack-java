def flatten(nList):
    flat_list = []
    for i in nList:
        # if it was an integer
        if i.isInteger():
            flat_list.append(i.getInteger())
        # if it was a list instead, go through the fucntion again
        else:
            flat_list.extend(flatten(i.getList()))
    return flat_list

print(flatten([1,2,[3,3],4]))
