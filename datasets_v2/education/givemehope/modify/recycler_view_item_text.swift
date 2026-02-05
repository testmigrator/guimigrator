import SwiftUI
struct recycler_view_item_text: View {
    
    var body: some View {
        ZStack()
        {
            VStack
            {
                Text("@+id/textTitleTextView")
                    .frame(minWidth:0,maxWidth:.infinity)
                    .bold()
                    .font(.system(size: 16))
                    .foregroundColor(Color.gray)//update
                Text("@+id/textStoryTextView")
                    .frame(minWidth:0,maxWidth:.infinity)
                    .padding(.top,4)
                    .font(.system(size: 14))
                HStack
                {
                    Text("@+id/textFooterTextView")
                        .frame(minWidth:0,idealWidth:0)
                        .italic()
                        .font(.system(size: 12))
                        .foregroundColor(Color.gray)
                }
                .frame(minWidth:0,maxWidth:.infinity)
                .padding(.top,4)
            }
            .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
            .padding(16)
        }
        .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct recycler_view_item_text_Previews: PreviewProvider {
    static var previews: some View {
        recycler_view_item_text()
    }
}
